import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Inven {
    @FXML
    private TableView<Album> tableView;
    @FXML
    private TableColumn<Album, String> namaAlbumColumn;
    @FXML
    private TableColumn<Album, String> artisColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> tersediaColumn;

    @FXML
    private TextField namaAlbumField;
    @FXML
    private TextField artisField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField tersediaField;

    private ObservableList<Album> albumList;

    public void initialize() {
        albumList = FXCollections.observableArrayList();
        namaAlbumColumn.setCellValueFactory(new PropertyValueFactory<>("Nama almbum"));
        artisColumn.setCellValueFactory(new PropertyValueFactory<>("Artis"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("Total"));
        tersediaColumn.setCellValueFactory(new PropertyValueFactory<>("Tersedia"));

        tableView.setItems(albumList);
    }

    @FXML
    private void handleTambah() {
        try {
            String namaAlbum = namaAlbumField.getText();
            String artis = artisField.getText();
            int total = Integer.parseInt(totalField.getText());
            int tersedia = Integer.parseInt(tersediaField.getText());

            Album album = new Album(namaAlbum, artis, total, tersedia);
            albumList.add(album);

            tampilkanPesan("Album berhasil ditambahkan");
            clearFields();
        } catch (Exception e) {
            tampilkanError("Input tidak valid Periksa kembali data yang dimasukkan.");
        }
    }

    @FXML
    private void handleHapus() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            albumList.remove(selected);
            tampilkanPesan("Album berhasil dihapus");
        } else {
            tampilkanError("Tidak ada album yang dipilih");
        }
    }

    @FXML
    private void handleUpdate() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                selected.setNamaAlbum(namaAlbumField.getText());
                selected.setArtis(artisField.getText());
                selected.setTotal(Integer.parseInt(totalField.getText()));
                selected.setTersedia(Integer.parseInt(tersediaField.getText()));
                tableView.refresh();

                tampilkanPesan("Album berhasil diperbarui");
                clearFields();
            } catch (Exception e) {
                tampilkanError("Input tidak valid Periksa kembali data yang dimasukkan.");
            }
        } else {
            tampilkanError("Tidak ada album yang dipilih");
        }
    }

    @FXML
    private void handleSewa() {
        Album selected = tableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            if (selected.getTersedia() > 0) {
                selected.setTersedia(selected.getTersedia() - 1);
                tableView.refresh();
                tampilkanPesan("Album berhasil disewa");
            } else {
                tampilkanError("Album tidak tersedia untuk disewa");
            }
        } else {
            tampilkanError("Tidak ada album yang dipilih");
        }
    }

    private void tampilkanPesan(String pesan) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil");
        alert.setHeaderText(null);
        alert.setContentText(pesan);
        alert.showAndWait();
    }

    private void tampilkanError(String pesan) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Kesalahan");
        alert.setHeaderText(null);
        alert.setContentText(pesan);
        alert.showAndWait();
    }

    private void clearFields() {
        namaAlbumField.clear();
        artisField.clear();
        totalField.clear();
        tersediaField.clear();
    }
}