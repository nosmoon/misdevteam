/***************************************************************************************************
* 占쏙옙占싹몌옙 : 
* 占쏙옙占� : 
* 占쌜쇽옙占쏙옙占쏙옙 : 2017-01-05
* 占쌜쇽옙占쏙옙 : 占쏙옙 占쏙옙 홍
***************************************************************************************************/
/***************************************************************************************************
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占쏙옙占쏙옙 :  
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */
 

public class SS_SLS_EXTN_5810_LBUPYERINFORecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String buyer_nm;
	public String rdr_no;
	public String buyer_telno1;
	public String buyer_telno2;
	public String buyer_telno3;
	public String buyer_ptphno1;
	public String buyer_ptphno2;
	public String buyer_ptphno3;
	public String aplcdt;
	public String prodnm;
	public String medicd;
	public String campid;
	public String rcvr_qty;
	public String rcvr_uprc;
	public String rcvr_amt;
	public String bonm;
	public String bocd;
	public String rcvr_bonm;
	public String rcvr_bocd;
	public String botelno;
	public String rcvr_nm;
	public String rcvr_telno1;
	public String rcvr_telno2;
	public String rcvr_telno3;
	public String rcvr_ptphno1;
	public String rcvr_ptphno2;
	public String rcvr_ptphno3;
	public String rcvr_zip;
	public String rcvr_addr;
	public String rcvr_dtlsaddr;
	public String remk;
	public String dlvstat;
	public String bo_headcnfmdt;
	public String dlvdt;
	public String errinfo;
	public String pay_mthd;
	public String pay_gb;
	public String bldmngnn;
	public String ordr_no;
	public String check;
	public String partnm;
	public String deptnm;
	public String areanm;
	public String subscnfmstatcd;
	public String aplcpersid;

	public SS_SLS_EXTN_5810_LBUPYERINFORecord(){}
	
	public String getAplcpersid() {
		return aplcpersid;
	}

	public void setAplcpersid(String aplcpersid) {
		this.aplcpersid = aplcpersid;
	}

	public String getSubscnfmstatcd() {
		return subscnfmstatcd;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd) {
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public String getPartnm() {
		return partnm;
	}

	public void setPartnm(String partnm) {
		this.partnm = partnm;
	}

	public String getDeptnm() {
		return deptnm;
	}

	public void setDeptnm(String deptnm) {
		this.deptnm = deptnm;
	}

	public String getAreanm() {
		return areanm;
	}

	public void setAreanm(String areanm) {
		this.areanm = areanm;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public String getOrdr_no() {
		return ordr_no;
	}

	public void setOrdr_no(String ordr_no) {
		this.ordr_no = ordr_no;
	}

	public String getRcvr_bocd() {
		return rcvr_bocd;
	}

	public void setRcvr_bocd(String rcvr_bocd) {
		this.rcvr_bocd = rcvr_bocd;
	}

	public String getBo_headcnfmdt() {
		return bo_headcnfmdt;
	}

	public void setBo_headcnfmdt(String bo_headcnfmdt) {
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public String getErrinfo() {
		return errinfo;
	}

	public void setErrinfo(String errinfo) {
		this.errinfo = errinfo;
	}

	public String getRdr_extndt() {
		return rdr_extndt;
	}

	public void setRdr_extndt(String rdr_extndt) {
		this.rdr_extndt = rdr_extndt;
	}

	public String getRdr_extnno() {
		return rdr_extnno;
	}


	public void setRdr_extnno(String rdr_extnno) {
		this.rdr_extnno = rdr_extnno;
	}

	public String getBldmngnn() {
		return bldmngnn;
	}

	public void setBldmngnn(String bldmngnn) {
		this.bldmngnn = bldmngnn;
	}

	public void setBuyer_nm(String buyer_nm){
		this.buyer_nm = buyer_nm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setBuyer_telno1(String buyer_telno1){
		this.buyer_telno1 = buyer_telno1;
	}

	public void setBuyer_telno2(String buyer_telno2){
		this.buyer_telno2 = buyer_telno2;
	}

	public void setBuyer_telno3(String buyer_telno3){
		this.buyer_telno3 = buyer_telno3;
	}

	public void setBuyer_ptphno1(String buyer_ptphno1){
		this.buyer_ptphno1 = buyer_ptphno1;
	}

	public void setBuyer_ptphno2(String buyer_ptphno2){
		this.buyer_ptphno2 = buyer_ptphno2;
	}

	public void setBuyer_ptphno3(String buyer_ptphno3){
		this.buyer_ptphno3 = buyer_ptphno3;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setRcvr_qty(String rcvr_qty){
		this.rcvr_qty = rcvr_qty;
	}

	public void setRcvr_uprc(String rcvr_uprc){
		this.rcvr_uprc = rcvr_uprc;
	}

	public void setRcvr_amt(String rcvr_amt){
		this.rcvr_amt = rcvr_amt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBotelno(String botelno){
		this.botelno = botelno;
	}

	public void setRcvr_nm(String rcvr_nm){
		this.rcvr_nm = rcvr_nm;
	}

	public void setRcvr_telno1(String rcvr_telno1){
		this.rcvr_telno1 = rcvr_telno1;
	}

	public void setRcvr_telno2(String rcvr_telno2){
		this.rcvr_telno2 = rcvr_telno2;
	}

	public void setRcvr_telno3(String rcvr_telno3){
		this.rcvr_telno3 = rcvr_telno3;
	}

	public void setRcvr_ptphno1(String rcvr_ptphno1){
		this.rcvr_ptphno1 = rcvr_ptphno1;
	}

	public void setRcvr_ptphno2(String rcvr_ptphno2){
		this.rcvr_ptphno2 = rcvr_ptphno2;
	}

	public void setRcvr_ptphno3(String rcvr_ptphno3){
		this.rcvr_ptphno3 = rcvr_ptphno3;
	}

	public void setRcvr_zip(String rcvr_zip){
		this.rcvr_zip = rcvr_zip;
	}

	public void setRcvr_addr(String rcvr_addr){
		this.rcvr_addr = rcvr_addr;
	}

	public void setRcvr_dtlsaddr(String rcvr_dtlsaddr){
		this.rcvr_dtlsaddr = rcvr_dtlsaddr;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDlvstat(String dlvstat){
		this.dlvstat = dlvstat;
	}

	public void setDlvdt(String dlvdt){
		this.dlvdt = dlvdt;
	}


	public void setPay_mthd(String pay_mthd){
		this.pay_mthd = pay_mthd;
	}

	public void setPay_gb(String pay_gb){
		this.pay_gb = pay_gb;
	}

	public String getBuyer_nm(){
		return this.buyer_nm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getBuyer_telno1(){
		return this.buyer_telno1;
	}

	public String getBuyer_telno2(){
		return this.buyer_telno2;
	}

	public String getBuyer_telno3(){
		return this.buyer_telno3;
	}

	public String getBuyer_ptphno1(){
		return this.buyer_ptphno1;
	}

	public String getBuyer_ptphno2(){
		return this.buyer_ptphno2;
	}

	public String getBuyer_ptphno3(){
		return this.buyer_ptphno3;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getRcvr_qty(){
		return this.rcvr_qty;
	}

	public String getRcvr_uprc(){
		return this.rcvr_uprc;
	}

	public String getRcvr_amt(){
		return this.rcvr_amt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBotelno(){
		return this.botelno;
	}

	public String getRcvr_nm(){
		return this.rcvr_nm;
	}

	public String getRcvr_telno1(){
		return this.rcvr_telno1;
	}

	public String getRcvr_telno2(){
		return this.rcvr_telno2;
	}

	public String getRcvr_telno3(){
		return this.rcvr_telno3;
	}

	public String getRcvr_ptphno1(){
		return this.rcvr_ptphno1;
	}

	public String getRcvr_ptphno2(){
		return this.rcvr_ptphno2;
	}

	public String getRcvr_ptphno3(){
		return this.rcvr_ptphno3;
	}

	public String getRcvr_zip(){
		return this.rcvr_zip;
	}

	public String getRcvr_addr(){
		return this.rcvr_addr;
	}

	public String getRcvr_dtlsaddr(){
		return this.rcvr_dtlsaddr;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDlvstat(){
		return this.dlvstat;
	}

	public String getDlvdt(){
		return this.dlvdt;
	}

	public String getPay_mthd(){
		return this.pay_mthd;
	}

	public String getPay_gb(){
		return this.pay_gb;
	}

	public String getProdnm() {
		return prodnm;
	}

	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}

	public String getBocd() {
		return bocd;
	}

	public void setBocd(String bocd) {
		this.bocd = bocd;
	}

	public String getRcvr_bonm() {
		return rcvr_bonm;
	}

	public void setRcvr_bonm(String rcvr_bonm) {
		this.rcvr_bonm = rcvr_bonm;
	}
	
}

/* �옉�꽦�떆媛� : Tue Feb 13 14:29:19 KST 2018 */