package org.ap.dms.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "APPLICATION _M_PRODUCT")
@XmlRootElement
public class ApplicationMProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "productIdSequence", sequenceName = "productId_seq", allocationSize = 1, initialValue = 100000)
	@Column(name = "PRODUCT_ID")
	private long productId;
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	@Column(name = "PRODUCT_NAME")
	private String productName;
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_DES")
	private String productDes;
	public String getProductDes() {
		return productDes;
	}

	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}

	@Override
	public String toString() {
		return "ApplicationMProduct [productId=" + productId + ", productName=" + productName + ", productDes="
				+ productDes + "]";
	}

}
