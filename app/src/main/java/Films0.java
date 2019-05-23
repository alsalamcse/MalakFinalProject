import java.util.Date;

public class Films0 {
    private String name;
    private String kind;
    private String date;
    private String rate;
    private String _id;

    public Films0()
    {

    }
    public Films0(String name,String kind,String date,String rate,String _id)
    {
        this.name=name;
        this.kind=kind;
        this.date=date;
        this.rate=rate;
        this._id=_id;

    }
    public String get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
    public String getKind() {
        return kind;
    }
    public String getRate() {
        return rate;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setRate(String phoneNumber) {
        this.rate = rate;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String toString()
    {
        return "name:" + name +"id:" + _id +"date:"+ date+"kind:"+ kind+"rate"+rate;
    }
}

