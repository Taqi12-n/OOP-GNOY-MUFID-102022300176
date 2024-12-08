public class Album {
    private String namaAlbum;
    private String artis;
    private int total;
    private int tersedia;

    public Album(String namaAlbum, String artis, int total, int tersedia) {
        this.namaAlbum = namaAlbum;
        this.artis = artis;
        this.total = total;
        this.tersedia = tersedia;
    }

    public String getNamaAlbum() {
        return namaAlbum;
    }

    public void setNamaAlbum(String namaAlbum) {
        this.namaAlbum = namaAlbum;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTersedia() {
        return tersedia;
    }

    public void setTersedia(int tersedia) {
        this.tersedia = tersedia;
    }
}
