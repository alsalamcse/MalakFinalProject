package com.hamood.malak.cinema;

    public class Films1
    {
        private String name;
        private String rate;
        private String date;
        private String kind;
        private long _id;

        public Films1()
        {

        }

        public Films1(String name,String rate,String date, String kind,long _id)
        {
            this._id=_id;
            this.name=name;
            this.date=date;
            this.rate=rate;
            this.kind=kind;
        }


        public String getKind() {
            return kind;
        }

        public String getDate() {
            return date;
        }

        public String getName() {
            return name;
        }

        public String getRate() {
            return rate;
        }


        public long get_id() {
            return _id;
        }

        public void set_id(long _id) {
            this._id = _id;
        }


        public void setName(String name) {
            this.name = name;
        }

        public void setRate (String rate ) {
            this.rate = rate;
        }
        public void setDate(String date) {
            this.date = date;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }



        public String toString()
        {
            return "name:" + name +"id:" + _id +"rate:"+ rate+"date:"+ date+"kind:"+kind;
        }
    }


