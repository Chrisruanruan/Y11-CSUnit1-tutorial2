public class Main {
    public static void main(String[] args) {
        String myFavoriteArtist = "Eric";
        //System.out.print(myFavoriteArtist);
        int myFavouriteArtistLength = myFavoriteArtist.length();
        //System.out.print(myFavouriteArtistLength);
        String myFavouriteArtistUpper = myFavoriteArtist.toUpperCase();
        //System.out.print(myFavouriteArtistUpper);
        String myFavouriteArtistLower = myFavoriteArtist.toLowerCase();
        //System.out.print(myFavouriteArtistLower);
        String checkFor = "ift";
        boolean myFavouriteArtistContains = myFavoriteArtist.contains(checkFor);
        //System.out.print(myFavouriteArtistContains);
        String firstName = "Chris";
        String lastName = "Ruan";
        int age = 16;
        String myInfo = "First name:" + firstName + "\nLast name:" + lastName + "\nAge:" + age + "\nfavorite artist:" + myFavoriteArtist;
        //System.out.print(myInfo);
        String ToIntTest = "16";
        int stringToIntTestStore = Integer.parseInt(ToIntTest);
        String intToStringTest = "stringToIntTestStore";
    }
}