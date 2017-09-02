package cn.panda;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {

    public static final String CHARSET = "UTF-8";
    private static final CloseableHttpClient httpClient;

    static {
        RequestConfig config = RequestConfig.custom().setConnectTimeout(60000).setSocketTimeout(15000).build();
        httpClient = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        String urlTemp = "https://m.weibo.cn/api/container/getIndex?containerid=1076031242301364&page=%s";

        for (int i = 1; i <= 945; i++) {
            String url = String.format(urlTemp, i);
            String weibos = getWeibo(url);
            File file = new File("weibo-" + i + ".txt");
            FileUtils.writeStringToFile(file, weibos);
            Thread.sleep((1 + (int) (Math.random() * 5)) * 1000);
        }
    }


    public static String unicodeToString(String str) {

        Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{4}))");
        Matcher matcher = pattern.matcher(str);
        char ch;
        while (matcher.find()) {
            ch = (char) Integer.parseInt(matcher.group(2), 16);
            str = str.replace(matcher.group(1), ch + "");
        }
        return str;
    }

    public static String getWeibo(String url) {

        String result = "";

        try {

            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                httpGet.abort();
                throw new RuntimeException("HttpClient,error status code :" + statusCode);
            }
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                result = EntityUtils.toString(entity, "utf-8");
                System.out.println("===============");
                System.out.println(result);
                System.out.println("===============");
                return result;
            }
            EntityUtils.consume(entity);
            response.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}