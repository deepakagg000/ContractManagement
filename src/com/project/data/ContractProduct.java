package com.project.data;

public class ContractProduct {

	int contract_id;
	int product_id;
	public ContractProduct(int contract_id, int product_id) {
		super();
		this.contract_id = contract_id;
		this.product_id = product_id;
	}
	public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
}
