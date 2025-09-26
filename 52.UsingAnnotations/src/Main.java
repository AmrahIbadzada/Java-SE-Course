public class Main {
    public static void main(String[] args) {
        // ANNOTATION

/*        AnnotationInvoker annotationInvoker = new AnnotationInvoker();

        Class<?> clazz = annotationInvoker.getClass();

        DatabaseConf annotation = clazz.getAnnotation(DatabaseConf.class);
        if (annotation != null) {
            System.out.println("URL :" + annotation.url());
            System.out.println("USERNAME :" + annotation.username());
            System.out.println("PASSWORD :" + annotation.password());
            System.out.println("Port : " + annotation.port());
        }*/

        AnnotationInvoker annotationInvoker = new AnnotationInvoker();
        annotationInvoker.write();
    }
}