/***************************************************************************************************
 * 파일명 : CO_L_RDRCRTS_GRAD_APLC.java
 * 기능 : 독자우대등급관리(독자우대기존독자목록조회)
 * 작성일자 : 2004-04-29
 * 작성자 : 김영윤
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 우리이웃 이벤트를 위한 remk 추가
 * 수정자 : 노상현
 * 수정일자 : 2004-11-30
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 독자인증 파라미터값 변경
 * 수정자 : 노상현
 * 수정일자 : 2005-02-23
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 현금영수증 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2005-11-10
 * 백업 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 : 모바일기사 서비스 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2006-08-16
 * 백업 : 
 ***************************************************************************************************/
 /***************************************************************************************************
 * 수정내역 : Ireader 서비스 관련 항목추가
 * 수정자 : 노상현
 * 수정일자 : 2008-03-06
 * 백업 : 
 ***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-모닝플러스회원,현금영수증,모바일조선,Ireader회원관리
 */

public class CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String medicd;
	public String medinm;
	public String fstsubsdt;
	public String dtlsprocstat;
	public String dtlsprocstatnm;
	public String errresncd;
	public String errresncdnm;
	public String bocd;
	public String bonm;
	public String id;
	public String entr_no;
	public String memb_nm_korn;
	public String rdrnm;
	public String prn;
	public String email;
	public String ceph_no_1;
	public String ceph_no_2;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String home_tel_no;
	public String subspersrshpcd;
	public String memb_kind_cd;
	public String procdt;
	public String recnm;
	public Timestamp recdt;
	public String recprn;
	public String recstat;
	public String cashstatnm;
	public String suspdt;
	public String mblefrdt;
	public String mbleexpydt;
	public String mblestatcd;
	public String mblenonrsmgcd;
	public int rnum;

	public CO_L_RDRCRTS_GRAD_APLCRDR_GRADAPLCCURRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setFstsubsdt(String fstsubsdt){
		this.fstsubsdt = fstsubsdt;
	}

	public void setDtlsprocstat(String dtlsprocstat){
		this.dtlsprocstat = dtlsprocstat;
	}

	public void setDtlsprocstatnm(String dtlsprocstatnm){
		this.dtlsprocstatnm = dtlsprocstatnm;
	}

	public void setErrresncd(String errresncd){
		this.errresncd = errresncd;
	}

	public void setErrresncdnm(String errresncdnm){
		this.errresncdnm = errresncdnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setEntr_no(String entr_no){
		this.entr_no = entr_no;
	}

	public void setMemb_nm_korn(String memb_nm_korn){
		this.memb_nm_korn = memb_nm_korn;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setCeph_no_1(String ceph_no_1){
		this.ceph_no_1 = ceph_no_1;
	}

	public void setCeph_no_2(String ceph_no_2){
		this.ceph_no_2 = ceph_no_2;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setHome_tel_no(String home_tel_no){
		this.home_tel_no = home_tel_no;
	}

	public void setSubspersrshpcd(String subspersrshpcd){
		this.subspersrshpcd = subspersrshpcd;
	}

	public void setMemb_kind_cd(String memb_kind_cd){
		this.memb_kind_cd = memb_kind_cd;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setRecnm(String recnm){
		this.recnm = recnm;
	}

	public void setRecdt(Timestamp recdt){
		this.recdt = recdt;
	}

	public void setRecprn(String recprn){
		this.recprn = recprn;
	}

	public void setRecstat(String recstat){
		this.recstat = recstat;
	}

	public void setCashstatnm(String cashstatnm){
		this.cashstatnm = cashstatnm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setMblefrdt(String mblefrdt){
		this.mblefrdt = mblefrdt;
	}

	public void setMbleexpydt(String mbleexpydt){
		this.mbleexpydt = mbleexpydt;
	}

	public void setMblestatcd(String mblestatcd){
		this.mblestatcd = mblestatcd;
	}

	public void setMblenonrsmgcd(String mblenonrsmgcd){
		this.mblenonrsmgcd = mblenonrsmgcd;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getFstsubsdt(){
		return this.fstsubsdt;
	}

	public String getDtlsprocstat(){
		return this.dtlsprocstat;
	}

	public String getDtlsprocstatnm(){
		return this.dtlsprocstatnm;
	}

	public String getErrresncd(){
		return this.errresncd;
	}

	public String getErrresncdnm(){
		return this.errresncdnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getId(){
		return this.id;
	}

	public String getEntr_no(){
		return this.entr_no;
	}

	public String getMemb_nm_korn(){
		return this.memb_nm_korn;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getCeph_no_1(){
		return this.ceph_no_1;
	}

	public String getCeph_no_2(){
		return this.ceph_no_2;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getHome_tel_no(){
		return this.home_tel_no;
	}

	public String getSubspersrshpcd(){
		return this.subspersrshpcd;
	}

	public String getMemb_kind_cd(){
		return this.memb_kind_cd;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getRecnm(){
		return this.recnm;
	}

	public Timestamp getRecdt(){
		return this.recdt;
	}

	public String getRecprn(){
		return this.recprn;
	}

	public String getRecstat(){
		return this.recstat;
	}

	public String getCashstatnm(){
		return this.cashstatnm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getMblefrdt(){
		return this.mblefrdt;
	}

	public String getMbleexpydt(){
		return this.mbleexpydt;
	}

	public String getMblestatcd(){
		return this.mblestatcd;
	}

	public String getMblenonrsmgcd(){
		return this.mblenonrsmgcd;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Fri Mar 07 16:36:06 KST 2008 */