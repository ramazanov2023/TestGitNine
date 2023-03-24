package com.example.testgitnine;

import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Anime {

//        @SerializedName("name")
//        @Expose
//        private String name;
//
//        public String getName() {
//                return name;
//        }

        @SerializedName("page")
        @Expose
        public Integer page;
        @SerializedName("per_page")
        @Expose
        public Integer perPage;
        @SerializedName("total")
        @Expose
        public Integer total;
        @SerializedName("total_pages")
        @Expose
        public Integer totalPages;
        @SerializedName("data")
        @Expose
        public List<Datum> data;
        @SerializedName("support")
        @Expose
        public Support support;

        public Integer getTotal() {
                return total;
        }

        public class Datum {

                @SerializedName("id")
                @Expose
                public Integer id;
                @SerializedName("email")
                @Expose
                public String email;
                @SerializedName("first_name")
                @Expose
                public String firstName;
                @SerializedName("last_name")
                @Expose
                public String lastName;
                @SerializedName("avatar")
                @Expose
                public String avatar;

                public String getFirstName(){
                        return firstName;
                }

        }

        public class Support {

                @SerializedName("url")
                @Expose
                public String url;
                @SerializedName("text")
                @Expose
                public String text;

        }


}
