package cn.panda.process;

import cn.panda.entity.Mblog;
import cn.panda.entity.Pics;
import cn.panda.entity.Retweeted_status;
import cn.panda.entity.Root;
import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String weiboStrTemp = "weibo-%s.txt";
        String weibos = "";
        Root root = null;
        Mblog mblog = null;
        Retweeted_status retweeted_status = null;

        StringBuilder stringBuilder = new StringBuilder();

        List<String> selfImgUrlList = new ArrayList<String>();
        List<String> retweetImgUrlList = new ArrayList<String>();

        for(int x =1;x<=945;x++){

            weibos = String.format(weiboStrTemp,x);
            String weiboStr = FileUtils.readFileToString(new File(weibos), "UTF-8");

            try {
                 root = JSON.parseObject(weiboStr, Root.class);
            }catch (Exception e){
                System.out.println("----->"+x);
                 e.printStackTrace();
            }

            Integer cardSize = root.getCards().size();

            for (int i=0;i< cardSize;i++){

                mblog = root.getCards().get(i).getMblog();
                stringBuilder.append("====================微博开始====================\n");
                stringBuilder.append(mblog.getCreated_at()+"-"+mblog.getSource()+"\n");
                stringBuilder.append(mblog.getText()+"\n");
                //微博图片
                if(null != mblog.getPics()){
                    List<Pics> picsList =  mblog.getPics();
                    for(int y=0;y<picsList.size();y++){
                        selfImgUrlList.add(picsList.get(y).getLarge().getUrl());
                        stringBuilder.append(picsList.get(y).getLarge().getUrl()+"\n");
                    }
                }
                //转发微博的图片
                retweeted_status = mblog.getRetweeted_status();
                if(null != retweeted_status){
                        stringBuilder.append("=======转发微博======="+"\n");
                        stringBuilder.append(retweeted_status.getCreated_at()+"-"+retweeted_status.getSource()+"\n");
                        stringBuilder.append(retweeted_status.getText()+"\n");

                    if( null != retweeted_status.getPics()){
                        List<Pics> picsList = retweeted_status.getPics();
                        for(int z=0;z<picsList.size();z++){
                            stringBuilder.append(picsList.get(z).getLarge().getUrl()+"\n");
                            retweetImgUrlList.add(picsList.get(z).getLarge().getUrl());
                        }
                    }
                }
                stringBuilder.append("====================微博结束====================\n");
                stringBuilder.append("\n");
                stringBuilder.append("\n");
                stringBuilder.append("\n");
            }

//            FileUtils.writeStringToFile(new File("weibo.txt"),stringBuilder.toString(),"UTF-8");
//
        }

        //FileUtils.writeStringToFile(new File("weibo.txt"),stringBuilder.toString(),"UTF-8");
        for(String imgUrl:selfImgUrlList){
            try{
                downLoadFromUrl(imgUrl,"/Users/panda/weiboimg/self");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        for(String imgUrl:retweetImgUrlList){
            try{
                downLoadFromUrl(imgUrl,"/Users/panda/weiboimg/retweet");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }


    public static void  downLoadFromUrl(String urlStr,String savePath) throws IOException{
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(20*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1");

        InputStream inputStream = null;
        byte[] getData = null;
        try{
            //得到输入流
             inputStream = conn.getInputStream();
            //获取自己数组
            getData = readInputStream(inputStream);

        }catch (Exception e){
            e.printStackTrace();
        }

        //文件保存位置
        File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdir();
        }
        File file = new File(saveDir+File.separator+urlStr.replace("/","[x]"));
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if(fos!=null){
            fos.close();
        }
        if(inputStream!=null){
            inputStream.close();
        }

        System.out.println("info:"+url+" download success");
    }



    /**
     * 从输入流中获取字节数组
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }


}
