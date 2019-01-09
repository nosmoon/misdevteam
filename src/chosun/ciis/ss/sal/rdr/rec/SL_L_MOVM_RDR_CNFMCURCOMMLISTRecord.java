/***************************************************************************************************
* 파일명 : SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord.java
* 기능 : 독자-이사독자-인수확인독자-목록조회
* 작성일자 : 2004-06-30
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자-이사독자-인수확인독자-목록조회
 *
 */

public class SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public String medi;
	public String aplcdt;
	public String movmdt;
	public String addr;
	public String dtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String movmaddr;
	public String movmdtlsaddr;
	public String tel_no;
	public String trsfbocnfmstat;
	public String acptbocnfmstat;
	public String aplcpathnm;
	public String acptbocnfmdt_tm;
	public String trsfbonm;
	public String trsfbote_no;

	public SL_L_MOVM_RDR_CNFMCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedi(String medi){
		this.medi = medi;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setMovmaddr(String movmaddr){
		this.movmaddr = movmaddr;
	}

	public void setMovmdtlsaddr(String movmdtlsaddr){
		this.movmdtlsaddr = movmdtlsaddr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setTrsfbocnfmstat(String trsfbocnfmstat){
		this.trsfbocnfmstat = trsfbocnfmstat;
	}

	public void setAcptbocnfmstat(String acptbocnfmstat){
		this.acptbocnfmstat = acptbocnfmstat;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setAcptbocnfmdt_tm(String acptbocnfmdt_tm){
		this.acptbocnfmdt_tm = acptbocnfmdt_tm;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setTrsfbote_no(String trsfbote_no){
		this.trsfbote_no = trsfbote_no;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedi(){
		return this.medi;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getMovmaddr(){
		return this.movmaddr;
	}

	public String getMovmdtlsaddr(){
		return this.movmdtlsaddr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getTrsfbocnfmstat(){
		return this.trsfbocnfmstat;
	}

	public String getAcptbocnfmstat(){
		return this.acptbocnfmstat;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getAcptbocnfmdt_tm(){
		return this.acptbocnfmdt_tm;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getTrsfbote_no(){
		return this.trsfbote_no;
	}
}

/* 작성시간 : Thu Jul 01 15:27:21 KST 2004 */