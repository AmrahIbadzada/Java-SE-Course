import Unknown.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        //REFLECTION - yansima

        Employee employee = new Employee(1l,"Unknown", "Unk", 5000D);
        Field[] declaredFields = employee.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            String fieldValue = field.get(employee) + "";
            System.out.println(field.getName() + " - " + fieldValue);
        }
//        try {

/*          Class<?> clazz =  Class.forName("Unknown.Employee");
            Field[] declaredFields =   clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                System.out.println(field.getName());
                System.out.println("------------");
                System.out.println(field.getModifiers());*/

                /*if(field.getModifiers()==1) {
                    System.out.println(field.getName());
                }
            } */

//                System.out.println(field.get(declaredFields));

/*                Field[] fields = clazz.getFields();
                for (Field field : fields) {
                    System.out.println(field.getName());
                }*/


/*            Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : declaredConstructors) {
//                System.out.println(constructor.getName());
//                System.out.println(constructor.getParameterCount());
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                for (Class<?> parameter : parameterTypes) {
                    System.out.println(parameter.getTypeName());
                }
            }*/

/*             Method[] declaredMethods = clazz.getDeclaredMethods();
            String parameterTypes = "";
            for (Method method : declaredMethods) {
//                System.out.println(method.getName());
//                System.out.println(method.getModifiers());
//                System.out.println(method.getParameterCount());
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (Class<?> parameter : parameterTypes) {
                    System.out.println(parameter.getTypeName());
                } */

/*                Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    parameterTypes += parameter +" , ";
                }
                System.out.println(method.getName() +" " + parameterTypes);
                parameterTypes = "";

            }*/


//        }
/*        catch (ClassNotFoundException e) {
            System.out.println("Xeta Yarandi : " + e.getMessage());
        }*/
    }
}