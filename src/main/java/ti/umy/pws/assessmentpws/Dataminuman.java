/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.pws.assessmentpws;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "dataminuman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dataminuman.findAll", query = "SELECT d FROM Dataminuman d"),
    @NamedQuery(name = "Dataminuman.findById", query = "SELECT d FROM Dataminuman d WHERE d.id = :id"),
    @NamedQuery(name = "Dataminuman.findByNama", query = "SELECT d FROM Dataminuman d WHERE d.nama = :nama"),
    @NamedQuery(name = "Dataminuman.findByJenis", query = "SELECT d FROM Dataminuman d WHERE d.jenis = :jenis"),
    @NamedQuery(name = "Dataminuman.findByHarga", query = "SELECT d FROM Dataminuman d WHERE d.harga = :harga")})
public class Dataminuman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jenis")
    private String jenis;
    @Basic(optional = false)
    @Column(name = "harga")
    private String harga;

    public Dataminuman() {
    }

    public Dataminuman(Integer id) {
        this.id = id;
    }

    public Dataminuman(Integer id, String nama, String jenis, String harga) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dataminuman)) {
            return false;
        }
        Dataminuman other = (Dataminuman) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ti.umy.pws.assessmentpws.Dataminuman[ id=" + id + " ]";
    }
    
}
