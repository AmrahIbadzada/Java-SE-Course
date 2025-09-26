import java.lang.reflect.Method;

//@DatabaseConf(url = "http://mypage.net", username = "unknown",
//        password = "123", port = 80 ) // ornekdi tam baxan zaman yorum setrlerini silib bax

public class AnnotationInvoker {

    public void write() {
        DatabaseConf annotation = this.getClass().getAnnotation(DatabaseConf.class);
        if(annotation !=null) {
            System.out.println("URL :" + annotation.url());
            System.out.println("USERNAME :" + annotation.username());
            System.out.println("PASSWORD :" + annotation.password());
            System.out.println("Port : " + annotation.port());
        }
    }

    @Uzanti(boy ="M", ceki ="KG")
    public void write(double boy, double ceki) {

        Method[] methods = this.getClass().getMethods();
        for (Method method : methods) {
            Uzanti annotation = method.getAnnotation(Uzanti.class);
            if (annotation != null) {

                System.out.println("BOY : " + boy +" " + annotation.boy());
                System.out.println("Ceki : " + ceki +" " + annotation.ceki());
            }
        }

/*        Uzanti annotation = this.getClass().getAnnotation(Uzanti.class);
        if(annotation !=null) {

            System.out.println("BOY : " + boy +" " + annotation.boy());
            System.out.println("Ceki : " + ceki +" " + annotation.ceki());
        }*/
    }
}
