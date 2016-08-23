public class AutoInstanceHelper{


    public Object autoInstance(Class cl){
        Object o = cl.newInstance();
        Field[] fields = cl.getDeclaredFields();
        for(Field field : fields){
            field.setAccessible(true);
            Class type = field.getType();
            if(type == int.class || type == Integer.class){
                field.set(o,1);
                continue ;
            }
            if(type == long.class || type == Long.class){
                field.set(o,1);
                continue ;
            }
            if(type == String.class ){
                field.set(o,"test");
                continue;
            }
            if(type ==Date.class){
                field.set(o,new Date());
                continue ;
            }
            //to add  ...
        }
        return o;
    }
}