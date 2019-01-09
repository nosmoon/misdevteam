/***************************************************************************************************
* �뜝�룞�삕�뜝�떦紐뚯삕 : 
* �뜝�룞�삕�뜝占� : 
* �뜝�뙗�눦�삕�뜝�룞�삕�뜝�룞�삕 : 2017-01-05
* �뜝�뙗�눦�삕�뜝�룞�삕 : �뜝�룞�삕 �뜝�룞�삕 �솉
***************************************************************************************************/
/***************************************************************************************************
* �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 : 
* �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 :  
* �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 : 
* �뜝�룞�삕�뜝占� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */
 

public class SS_SLS_EXTN_5820_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String bocd;
	public String rcvr_bocd;
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
	public String bo_headcnfmdt;
	public String dlvdt;
	public String bldnmgnn;
	public String ordr_no;
	public String incmgpers;
	public String subscnfmstatcd;
	
	public SS_SLS_EXTN_5820_UDM(){}
	public SS_SLS_EXTN_5820_UDM(String rdr_extndt, String rdr_extnno, String buyer_nm, String rdr_no, String buyer_telno1, String buyer_telno2, String buyer_telno3, String buyer_ptphno1, String buyer_ptphno2, String buyer_ptphno3, String aplcdt, String prodnm, String medicd, String campid, String rcvr_qty, String rcvr_uprc, String rcvr_amt, String bonm, String rcvr_bocd, String botelno, String rcvr_nm, String rcvr_telno1, String rcvr_telno2, String rcvr_telno3, String rcvr_ptphno1, String rcvr_ptphno2, String rcvr_ptphno3, String rcvr_zip, String rcvr_addr, String rcvr_dtlsaddr, String remk, String dlvstat, String bo_headcnfmdt, String dlvdt, String errinfo, String pay_mthd, String pay_gb, String bldnmgnn, String ordr_no, String incmgpers, String subscnfmstatcd){
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.rcvr_bocd = rcvr_bocd;
		this.rcvr_nm = rcvr_nm;
		this.rcvr_telno1 = rcvr_telno1;
		this.rcvr_telno2 = rcvr_telno2;
		this.rcvr_telno3 = rcvr_telno3;
		this.rcvr_ptphno1 = rcvr_ptphno1;
		this.rcvr_ptphno2 = rcvr_ptphno2;
		this.rcvr_ptphno3 = rcvr_ptphno3;
		this.rcvr_zip = rcvr_zip;
		this.rcvr_addr = rcvr_addr;
		this.rcvr_dtlsaddr = rcvr_dtlsaddr;
		this.remk = remk;
		this.bo_headcnfmdt = bo_headcnfmdt;
		this.dlvdt = dlvdt;
		this.bldnmgnn = bldnmgnn;
		this.ordr_no = ordr_no;
		this.incmgpers = incmgpers;
		this.subscnfmstatcd = subscnfmstatcd;
	}
	
	
	
	public String getSubscnfmstatcd() {
		return subscnfmstatcd;
	}
	public void setSubscnfmstatcd(String subscnfmstatcd) {
		this.subscnfmstatcd = subscnfmstatcd;
	}
	public String getBocd() {
		return bocd;
	}
	
	public void setBocd(String bocd) {
		this.bocd = bocd;
	}
	
	public String getIncmgpers() {
		return incmgpers;
	}
	
	public void setIncmgpers(String incmgpers) {
		this.incmgpers = incmgpers;
	}

	public String getOrdr_no() {
		return ordr_no;
	}
	
	public void setOrdr_no(String ordr_no) {
		this.ordr_no = ordr_no;
	}
	
	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRcvr_bocd(String rcvr_bocd){
		this.rcvr_bocd = rcvr_bocd;
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

	public void setBo_headcnfmdt(String bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setDlvdt(String dlvdt){
		this.dlvdt = dlvdt;
	}

	public void setBldnmgnn(String bldnmgnn){
		this.bldnmgnn = bldnmgnn;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRcvr_bocd(){
		return this.rcvr_bocd;
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

	public String getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public String getDlvdt(){
		return this.dlvdt;
	}

	public String getBldnmgnn(){
		return this.bldnmgnn;
	}

	public String getSQL(){
		 return "{ call SP_SS_SLS_EXTN_5820_U(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5820_UDM dm = (SS_SLS_EXTN_5820_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extndt);
		cstmt.setString(4, dm.rdr_extnno);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.rcvr_bocd);
		cstmt.setString(7, dm.rcvr_nm);
		cstmt.setString(8, dm.rcvr_telno1);
		cstmt.setString(9, dm.rcvr_telno2);
		cstmt.setString(10, dm.rcvr_telno3);
		cstmt.setString(11, dm.rcvr_ptphno1);
		cstmt.setString(12, dm.rcvr_ptphno2);
		cstmt.setString(13, dm.rcvr_ptphno3);
		cstmt.setString(14, dm.rcvr_zip);
		cstmt.setString(15, dm.rcvr_addr);
		cstmt.setString(16, dm.rcvr_dtlsaddr);
		cstmt.setString(17, dm.remk);
		cstmt.setString(18, dm.bo_headcnfmdt);
		cstmt.setString(19, dm.dlvdt);
		cstmt.setString(20, dm.bldnmgnn);
		cstmt.setString(21, dm.ordr_no);
		cstmt.setString(22, dm.incmgpers);
		cstmt.setString(23, dm.subscnfmstatcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5820_UDataSet();
	}

    public void print(){
        System.out.println("rdr_extndt = " + getRdr_extndt());
        System.out.println("rdr_extnno = " + getRdr_extnno());
        System.out.println("rcvr_bocd = " + getRcvr_bocd());
        System.out.println("rcvr_nm = " + getRcvr_nm());
        System.out.println("rcvr_telno1 = " + getRcvr_telno1());
        System.out.println("rcvr_telno2 = " + getRcvr_telno2());
        System.out.println("rcvr_telno3 = " + getRcvr_telno3());
        System.out.println("rcvr_ptphno1 = " + getRcvr_ptphno1());
        System.out.println("rcvr_ptphno2 = " + getRcvr_ptphno2());
        System.out.println("rcvr_ptphno3 = " + getRcvr_ptphno3());
        System.out.println("rcvr_zip = " + getRcvr_zip());
        System.out.println("rcvr_addr = " + getRcvr_addr());
        System.out.println("rcvr_dtlsaddr = " + getRcvr_dtlsaddr());
        System.out.println("remk = " + getRemk());
        System.out.println("bo_headcnfmdt = " + getBo_headcnfmdt());
        System.out.println("dlvdt = " + getDlvdt());
        System.out.println("bldnmgnn = " + getBldnmgnn());
        System.out.println("ordr_no = " + getOrdr_no());
        System.out.println("incmgpers = "+getIncmgpers());
        System.out.println("subscnfmstatcd = "+getSubscnfmstatcd());
        System.out.println("bocd = "+getBocd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 req.getParameter() 筌ｏ옙�뵳占� 獄쏉옙 野껉퀗�궢占쏙옙占쏙옙 野껓옙占싼딉옙占� 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String buyer_nm = req.getParameter("buyer_nm");
if( buyer_nm == null){
	System.out.println(this.toString+" : buyer_nm is null" );
}else{
	System.out.println(this.toString+" : buyer_nm is "+buyer_nm );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String buyer_telno1 = req.getParameter("buyer_telno1");
if( buyer_telno1 == null){
	System.out.println(this.toString+" : buyer_telno1 is null" );
}else{
	System.out.println(this.toString+" : buyer_telno1 is "+buyer_telno1 );
}
String buyer_telno2 = req.getParameter("buyer_telno2");
if( buyer_telno2 == null){
	System.out.println(this.toString+" : buyer_telno2 is null" );
}else{
	System.out.println(this.toString+" : buyer_telno2 is "+buyer_telno2 );
}
String buyer_telno3 = req.getParameter("buyer_telno3");
if( buyer_telno3 == null){
	System.out.println(this.toString+" : buyer_telno3 is null" );
}else{
	System.out.println(this.toString+" : buyer_telno3 is "+buyer_telno3 );
}
String buyer_ptphno1 = req.getParameter("buyer_ptphno1");
if( buyer_ptphno1 == null){
	System.out.println(this.toString+" : buyer_ptphno1 is null" );
}else{
	System.out.println(this.toString+" : buyer_ptphno1 is "+buyer_ptphno1 );
}
String buyer_ptphno2 = req.getParameter("buyer_ptphno2");
if( buyer_ptphno2 == null){
	System.out.println(this.toString+" : buyer_ptphno2 is null" );
}else{
	System.out.println(this.toString+" : buyer_ptphno2 is "+buyer_ptphno2 );
}
String buyer_ptphno3 = req.getParameter("buyer_ptphno3");
if( buyer_ptphno3 == null){
	System.out.println(this.toString+" : buyer_ptphno3 is null" );
}else{
	System.out.println(this.toString+" : buyer_ptphno3 is "+buyer_ptphno3 );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String prodnm = req.getParameter("prodnm");
if( prodnm == null){
	System.out.println(this.toString+" : prodnm is null" );
}else{
	System.out.println(this.toString+" : prodnm is "+prodnm );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String campid = req.getParameter("campid");
if( campid == null){
	System.out.println(this.toString+" : campid is null" );
}else{
	System.out.println(this.toString+" : campid is "+campid );
}
String rcvr_qty = req.getParameter("rcvr_qty");
if( rcvr_qty == null){
	System.out.println(this.toString+" : rcvr_qty is null" );
}else{
	System.out.println(this.toString+" : rcvr_qty is "+rcvr_qty );
}
String rcvr_uprc = req.getParameter("rcvr_uprc");
if( rcvr_uprc == null){
	System.out.println(this.toString+" : rcvr_uprc is null" );
}else{
	System.out.println(this.toString+" : rcvr_uprc is "+rcvr_uprc );
}
String rcvr_amt = req.getParameter("rcvr_amt");
if( rcvr_amt == null){
	System.out.println(this.toString+" : rcvr_amt is null" );
}else{
	System.out.println(this.toString+" : rcvr_amt is "+rcvr_amt );
}
String bonm = req.getParameter("bonm");
if( bonm == null){
	System.out.println(this.toString+" : bonm is null" );
}else{
	System.out.println(this.toString+" : bonm is "+bonm );
}
String rcvr_bocd = req.getParameter("rcvr_bocd");
if( rcvr_bocd == null){
	System.out.println(this.toString+" : rcvr_bocd is null" );
}else{
	System.out.println(this.toString+" : rcvr_bocd is "+rcvr_bocd );
}
String botelno = req.getParameter("botelno");
if( botelno == null){
	System.out.println(this.toString+" : botelno is null" );
}else{
	System.out.println(this.toString+" : botelno is "+botelno );
}
String rcvr_nm = req.getParameter("rcvr_nm");
if( rcvr_nm == null){
	System.out.println(this.toString+" : rcvr_nm is null" );
}else{
	System.out.println(this.toString+" : rcvr_nm is "+rcvr_nm );
}
String rcvr_telno1 = req.getParameter("rcvr_telno1");
if( rcvr_telno1 == null){
	System.out.println(this.toString+" : rcvr_telno1 is null" );
}else{
	System.out.println(this.toString+" : rcvr_telno1 is "+rcvr_telno1 );
}
String rcvr_telno2 = req.getParameter("rcvr_telno2");
if( rcvr_telno2 == null){
	System.out.println(this.toString+" : rcvr_telno2 is null" );
}else{
	System.out.println(this.toString+" : rcvr_telno2 is "+rcvr_telno2 );
}
String rcvr_telno3 = req.getParameter("rcvr_telno3");
if( rcvr_telno3 == null){
	System.out.println(this.toString+" : rcvr_telno3 is null" );
}else{
	System.out.println(this.toString+" : rcvr_telno3 is "+rcvr_telno3 );
}
String rcvr_ptphno1 = req.getParameter("rcvr_ptphno1");
if( rcvr_ptphno1 == null){
	System.out.println(this.toString+" : rcvr_ptphno1 is null" );
}else{
	System.out.println(this.toString+" : rcvr_ptphno1 is "+rcvr_ptphno1 );
}
String rcvr_ptphno2 = req.getParameter("rcvr_ptphno2");
if( rcvr_ptphno2 == null){
	System.out.println(this.toString+" : rcvr_ptphno2 is null" );
}else{
	System.out.println(this.toString+" : rcvr_ptphno2 is "+rcvr_ptphno2 );
}
String rcvr_ptphno3 = req.getParameter("rcvr_ptphno3");
if( rcvr_ptphno3 == null){
	System.out.println(this.toString+" : rcvr_ptphno3 is null" );
}else{
	System.out.println(this.toString+" : rcvr_ptphno3 is "+rcvr_ptphno3 );
}
String rcvr_zip = req.getParameter("rcvr_zip");
if( rcvr_zip == null){
	System.out.println(this.toString+" : rcvr_zip is null" );
}else{
	System.out.println(this.toString+" : rcvr_zip is "+rcvr_zip );
}
String rcvr_addr = req.getParameter("rcvr_addr");
if( rcvr_addr == null){
	System.out.println(this.toString+" : rcvr_addr is null" );
}else{
	System.out.println(this.toString+" : rcvr_addr is "+rcvr_addr );
}
String rcvr_dtlsaddr = req.getParameter("rcvr_dtlsaddr");
if( rcvr_dtlsaddr == null){
	System.out.println(this.toString+" : rcvr_dtlsaddr is null" );
}else{
	System.out.println(this.toString+" : rcvr_dtlsaddr is "+rcvr_dtlsaddr );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String dlvstat = req.getParameter("dlvstat");
if( dlvstat == null){
	System.out.println(this.toString+" : dlvstat is null" );
}else{
	System.out.println(this.toString+" : dlvstat is "+dlvstat );
}
String bo_headcnfmdt = req.getParameter("bo_headcnfmdt");
if( bo_headcnfmdt == null){
	System.out.println(this.toString+" : bo_headcnfmdt is null" );
}else{
	System.out.println(this.toString+" : bo_headcnfmdt is "+bo_headcnfmdt );
}
String dlvdt = req.getParameter("dlvdt");
if( dlvdt == null){
	System.out.println(this.toString+" : dlvdt is null" );
}else{
	System.out.println(this.toString+" : dlvdt is "+dlvdt );
}
String errinfo = req.getParameter("errinfo");
if( errinfo == null){
	System.out.println(this.toString+" : errinfo is null" );
}else{
	System.out.println(this.toString+" : errinfo is "+errinfo );
}
String pay_mthd = req.getParameter("pay_mthd");
if( pay_mthd == null){
	System.out.println(this.toString+" : pay_mthd is null" );
}else{
	System.out.println(this.toString+" : pay_mthd is "+pay_mthd );
}
String pay_gb = req.getParameter("pay_gb");
if( pay_gb == null){
	System.out.println(this.toString+" : pay_gb is null" );
}else{
	System.out.println(this.toString+" : pay_gb is "+pay_gb );
}
String bldnmgnn = req.getParameter("bldnmgnn");
if( bldnmgnn == null){
	System.out.println(this.toString+" : bldnmgnn is null" );
}else{
	System.out.println(this.toString+" : bldnmgnn is "+bldnmgnn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 req.getParameter() 筌ｏ옙�뵳�딉옙占� 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String buyer_nm = Util.checkString(req.getParameter("buyer_nm"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String buyer_telno1 = Util.checkString(req.getParameter("buyer_telno1"));
String buyer_telno2 = Util.checkString(req.getParameter("buyer_telno2"));
String buyer_telno3 = Util.checkString(req.getParameter("buyer_telno3"));
String buyer_ptphno1 = Util.checkString(req.getParameter("buyer_ptphno1"));
String buyer_ptphno2 = Util.checkString(req.getParameter("buyer_ptphno2"));
String buyer_ptphno3 = Util.checkString(req.getParameter("buyer_ptphno3"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String prodnm = Util.checkString(req.getParameter("prodnm"));
String medicd = Util.checkString(req.getParameter("medicd"));
String campid = Util.checkString(req.getParameter("campid"));
String rcvr_qty = Util.checkString(req.getParameter("rcvr_qty"));
String rcvr_uprc = Util.checkString(req.getParameter("rcvr_uprc"));
String rcvr_amt = Util.checkString(req.getParameter("rcvr_amt"));
String bonm = Util.checkString(req.getParameter("bonm"));
String rcvr_bocd = Util.checkString(req.getParameter("rcvr_bocd"));
String botelno = Util.checkString(req.getParameter("botelno"));
String rcvr_nm = Util.checkString(req.getParameter("rcvr_nm"));
String rcvr_telno1 = Util.checkString(req.getParameter("rcvr_telno1"));
String rcvr_telno2 = Util.checkString(req.getParameter("rcvr_telno2"));
String rcvr_telno3 = Util.checkString(req.getParameter("rcvr_telno3"));
String rcvr_ptphno1 = Util.checkString(req.getParameter("rcvr_ptphno1"));
String rcvr_ptphno2 = Util.checkString(req.getParameter("rcvr_ptphno2"));
String rcvr_ptphno3 = Util.checkString(req.getParameter("rcvr_ptphno3"));
String rcvr_zip = Util.checkString(req.getParameter("rcvr_zip"));
String rcvr_addr = Util.checkString(req.getParameter("rcvr_addr"));
String rcvr_dtlsaddr = Util.checkString(req.getParameter("rcvr_dtlsaddr"));
String remk = Util.checkString(req.getParameter("remk"));
String dlvstat = Util.checkString(req.getParameter("dlvstat"));
String bo_headcnfmdt = Util.checkString(req.getParameter("bo_headcnfmdt"));
String dlvdt = Util.checkString(req.getParameter("dlvdt"));
String errinfo = Util.checkString(req.getParameter("errinfo"));
String pay_mthd = Util.checkString(req.getParameter("pay_mthd"));
String pay_gb = Util.checkString(req.getParameter("pay_gb"));
String bldnmgnn = Util.checkString(req.getParameter("bldnmgnn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 占쏙옙疫뀐옙筌ｏ옙�뵳�딉옙占� 占쏙옙占쏙옙占쏙옙 req.getParameter() 筌ｏ옙�뵳�딉옙占� 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String buyer_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_nm")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String buyer_telno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_telno1")));
String buyer_telno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_telno2")));
String buyer_telno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_telno3")));
String buyer_ptphno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_ptphno1")));
String buyer_ptphno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_ptphno2")));
String buyer_ptphno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("buyer_ptphno3")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String prodnm = Util.Uni2Ksc(Util.checkString(req.getParameter("prodnm")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String campid = Util.Uni2Ksc(Util.checkString(req.getParameter("campid")));
String rcvr_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_qty")));
String rcvr_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_uprc")));
String rcvr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_amt")));
String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
String rcvr_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_bocd")));
String botelno = Util.Uni2Ksc(Util.checkString(req.getParameter("botelno")));
String rcvr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_nm")));
String rcvr_telno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_telno1")));
String rcvr_telno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_telno2")));
String rcvr_telno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_telno3")));
String rcvr_ptphno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_ptphno1")));
String rcvr_ptphno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_ptphno2")));
String rcvr_ptphno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_ptphno3")));
String rcvr_zip = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_zip")));
String rcvr_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_addr")));
String rcvr_dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("rcvr_dtlsaddr")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String dlvstat = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvstat")));
String bo_headcnfmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmdt")));
String dlvdt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdt")));
String errinfo = Util.Uni2Ksc(Util.checkString(req.getParameter("errinfo")));
String pay_mthd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_mthd")));
String pay_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_gb")));
String bldnmgnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldnmgnn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 DM 占쏙옙占쎌눘占쏙옙 癰귨옙占쏙옙�몴占� 占썬끉占쏙옙占쏙옙 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setBuyer_nm(buyer_nm);
dm.setRdr_no(rdr_no);
dm.setBuyer_telno1(buyer_telno1);
dm.setBuyer_telno2(buyer_telno2);
dm.setBuyer_telno3(buyer_telno3);
dm.setBuyer_ptphno1(buyer_ptphno1);
dm.setBuyer_ptphno2(buyer_ptphno2);
dm.setBuyer_ptphno3(buyer_ptphno3);
dm.setAplcdt(aplcdt);
dm.setProdnm(prodnm);
dm.setMedicd(medicd);
dm.setCampid(campid);
dm.setRcvr_qty(rcvr_qty);
dm.setRcvr_uprc(rcvr_uprc);
dm.setRcvr_amt(rcvr_amt);
dm.setBonm(bonm);
dm.setRcvr_bocd(rcvr_bocd);
dm.setBotelno(botelno);
dm.setRcvr_nm(rcvr_nm);
dm.setRcvr_telno1(rcvr_telno1);
dm.setRcvr_telno2(rcvr_telno2);
dm.setRcvr_telno3(rcvr_telno3);
dm.setRcvr_ptphno1(rcvr_ptphno1);
dm.setRcvr_ptphno2(rcvr_ptphno2);
dm.setRcvr_ptphno3(rcvr_ptphno3);
dm.setRcvr_zip(rcvr_zip);
dm.setRcvr_addr(rcvr_addr);
dm.setRcvr_dtlsaddr(rcvr_dtlsaddr);
dm.setRemk(remk);
dm.setDlvstat(dlvstat);
dm.setBo_headcnfmdt(bo_headcnfmdt);
dm.setDlvdt(dlvdt);
dm.setErrinfo(errinfo);
dm.setPay_mthd(pay_mthd);
dm.setPay_gb(pay_gb);
dm.setBldnmgnn(bldnmgnn);
----------------------------------------------------------------------------------------------------*/


/* 占쏙옙占쎄퉮占쏙옙揶쏉옙 : Wed Feb 14 13:15:31 KST 2018 */