package com.example.serpentcs.retrofit;

import android.util.Log;

import java.util.List;

public class Contributor {

    public static final String TAG;


    static {
        TAG = Contributor.class.getSimpleName();
    }

    private List<Contacts> contacts;

    public Contributor(List<Contacts> contactsList) {
        Log.d(TAG, "Contributor: ");
        this.contacts = contactsList;
    }

    public List<Contacts> getContactsList() {
        return contacts;
    }

    public void setContactsList(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        //List toString() returns list of variable with opening and closing [] so u can use it directly

        String s = "";
        s += "Contributor(contacts=";
        s += contacts;
        s += ")";
        return s;


    }

    public class Contacts {
        private Phone phone;

        public Contacts(Phone phone) {
            Log.e(TAG, "Contacts: ");
            this.phone = phone;
        }

        public Phone getPhone() {
            return phone;
        }

        public void setPhone(Phone phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return " Contact ( Phone = " + phone + " )";
        }

        public class Phone {
            private String home;
            private String office;
            private String mobile;

            public Phone(String home, String office, String mobile) {
                this.home = home;
                this.office = office;
                this.mobile = mobile;
            }

            public String getHome() {
                return home;
            }

            public void setHome(String home) {
                this.home = home;
            }

            public String getOffice() {
                return office;
            }

            public void setOffice(String office) {
                this.office = office;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            @Override
            public String toString() {
                return "Phone ( home = " + home + " office = " + office + " mobile =" + mobile + " )";
            }
        }
    }


}
