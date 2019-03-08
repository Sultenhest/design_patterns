package prototype;

public class MyClass implements Cloneable {
    public int id;
    public String data;

    public MyClass(int id, String data) {
        this.id   = id;
        this.data = data;
    }

    @Override
    public Object clone() {
        try{
            return super.clone();
        } catch(CloneNotSupportedException ex) {
            System.out.println(ex);
        }

        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) {
            return false;
        }

        if ( obj == this ) {
            return true;
        }

        if ( !( obj instanceof MyClass ) ) {
            return false;
        }

        if ( ! super.equals( obj ) ) {
            //return false;
        }

        MyClass o = (MyClass) obj;
        return this.data.equals( o.data ) && this.id == o.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
