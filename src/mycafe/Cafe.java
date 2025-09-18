package mycafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private String name;
    private String address;
    private String businessHours; 
    private int rating;
    private List<String> photos;

    public Cafe(String name, String address) {
        this.name = name;
        this.address = address;
        this.businessHours = "未登録"; 
        this.rating = 0; 
        this.photos = new ArrayList<>(); 
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        }
    }

    public List<String> getPhotos() {
        return photos;
    }
    
    public void addPhoto(String photoPath) {
        this.photos.add(photoPath);
    }
}