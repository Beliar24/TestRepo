package oop.banking;

public class Books {

    private String userId;
    private CollectionOfIsbns[] collectionOfIsbns;

    public Books(String userId, CollectionOfIsbns[] collectionOfIsbns) {
        this.userId = userId;
        this.collectionOfIsbns = collectionOfIsbns;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CollectionOfIsbns[] getCollectionOfIsbns() {
        return collectionOfIsbns;
    }

    public void setCollectionOfIsbns(CollectionOfIsbns[] collectionOfIsbns) {
        this.collectionOfIsbns = collectionOfIsbns;
    }
}
