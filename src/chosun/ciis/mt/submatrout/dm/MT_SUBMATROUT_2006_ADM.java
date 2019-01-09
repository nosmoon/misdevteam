/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_2006_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String mov_inout_dt;
	public String mov_out_fac_cd;
	public String mov_out_deptcd;
	public String mov_in_fac_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mov_in_deptcd;
	public String matr_cd;
	public String mov_out_unit;
	public String mov_out_qunt;
	public String mov_out_uprc;
	public String mov_out_amt;
	public String mov_out_vat;
	public String mov_out_budg_cd;
	public String mov_in_unit;
	public String mov_in_qunt;
	public String mov_in_uprc;
	public String mov_in_amt;
	public String mov_in_vat;
	public String mov_in_budg_cd;
	public String medi_cd;
	public String medi_ser_no;
	public String remk;
	public String gubun;

	public MT_SUBMATROUT_2006_ADM(){}
	public MT_SUBMATROUT_2006_ADM(String cmpy_cd, String occr_dt, String seq, String sub_seq, String mov_inout_dt, String mov_out_fac_cd, String mov_out_deptcd, String mov_in_fac_cd, String incmg_pers_ipaddr, String incmg_pers, String mov_in_deptcd, String matr_cd, String mov_out_unit, String mov_out_qunt, String mov_out_uprc, String mov_out_amt, String mov_out_vat, String mov_out_budg_cd, String mov_in_unit, String mov_in_qunt, String mov_in_uprc, String mov_in_amt, String mov_in_vat, String mov_in_budg_cd, String medi_cd, String medi_ser_no, String remk, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.mov_inout_dt = mov_inout_dt;
		this.mov_out_fac_cd = mov_out_fac_cd;
		this.mov_out_deptcd = mov_out_deptcd;
		this.mov_in_fac_cd = mov_in_fac_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mov_in_deptcd = mov_in_deptcd;
		this.matr_cd = matr_cd;
		this.mov_out_unit = mov_out_unit;
		this.mov_out_qunt = mov_out_qunt;
		this.mov_out_uprc = mov_out_uprc;
		this.mov_out_amt = mov_out_amt;
		this.mov_out_vat = mov_out_vat;
		this.mov_out_budg_cd = mov_out_budg_cd;
		this.mov_in_unit = mov_in_unit;
		this.mov_in_qunt = mov_in_qunt;
		this.mov_in_uprc = mov_in_uprc;
		this.mov_in_amt = mov_in_amt;
		this.mov_in_vat = mov_in_vat;
		this.mov_in_budg_cd = mov_in_budg_cd;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.remk = remk;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMov_inout_dt(String mov_inout_dt){
		this.mov_inout_dt = mov_inout_dt;
	}

	public void setMov_out_fac_cd(String mov_out_fac_cd){
		this.mov_out_fac_cd = mov_out_fac_cd;
	}

	public void setMov_out_deptcd(String mov_out_deptcd){
		this.mov_out_deptcd = mov_out_deptcd;
	}

	public void setMov_in_fac_cd(String mov_in_fac_cd){
		this.mov_in_fac_cd = mov_in_fac_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMov_in_deptcd(String mov_in_deptcd){
		this.mov_in_deptcd = mov_in_deptcd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMov_out_unit(String mov_out_unit){
		this.mov_out_unit = mov_out_unit;
	}

	public void setMov_out_qunt(String mov_out_qunt){
		this.mov_out_qunt = mov_out_qunt;
	}

	public void setMov_out_uprc(String mov_out_uprc){
		this.mov_out_uprc = mov_out_uprc;
	}

	public void setMov_out_amt(String mov_out_amt){
		this.mov_out_amt = mov_out_amt;
	}

	public void setMov_out_vat(String mov_out_vat){
		this.mov_out_vat = mov_out_vat;
	}

	public void setMov_out_budg_cd(String mov_out_budg_cd){
		this.mov_out_budg_cd = mov_out_budg_cd;
	}

	public void setMov_in_unit(String mov_in_unit){
		this.mov_in_unit = mov_in_unit;
	}

	public void setMov_in_qunt(String mov_in_qunt){
		this.mov_in_qunt = mov_in_qunt;
	}

	public void setMov_in_uprc(String mov_in_uprc){
		this.mov_in_uprc = mov_in_uprc;
	}

	public void setMov_in_amt(String mov_in_amt){
		this.mov_in_amt = mov_in_amt;
	}

	public void setMov_in_vat(String mov_in_vat){
		this.mov_in_vat = mov_in_vat;
	}

	public void setMov_in_budg_cd(String mov_in_budg_cd){
		this.mov_in_budg_cd = mov_in_budg_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMov_inout_dt(){
		return this.mov_inout_dt;
	}

	public String getMov_out_fac_cd(){
		return this.mov_out_fac_cd;
	}

	public String getMov_out_deptcd(){
		return this.mov_out_deptcd;
	}

	public String getMov_in_fac_cd(){
		return this.mov_in_fac_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMov_in_deptcd(){
		return this.mov_in_deptcd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMov_out_unit(){
		return this.mov_out_unit;
	}

	public String getMov_out_qunt(){
		return this.mov_out_qunt;
	}

	public String getMov_out_uprc(){
		return this.mov_out_uprc;
	}

	public String getMov_out_amt(){
		return this.mov_out_amt;
	}

	public String getMov_out_vat(){
		return this.mov_out_vat;
	}

	public String getMov_out_budg_cd(){
		return this.mov_out_budg_cd;
	}

	public String getMov_in_unit(){
		return this.mov_in_unit;
	}

	public String getMov_in_qunt(){
		return this.mov_in_qunt;
	}

	public String getMov_in_uprc(){
		return this.mov_in_uprc;
	}

	public String getMov_in_amt(){
		return this.mov_in_amt;
	}

	public String getMov_in_vat(){
		return this.mov_in_vat;
	}

	public String getMov_in_budg_cd(){
		return this.mov_in_budg_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_2006_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_2006_ADM dm = (MT_SUBMATROUT_2006_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.sub_seq);
		cstmt.setString(7, dm.mov_inout_dt);
		cstmt.setString(8, dm.mov_out_fac_cd);
		cstmt.setString(9, dm.mov_out_deptcd);
		cstmt.setString(10, dm.mov_in_fac_cd);
		cstmt.setString(11, dm.incmg_pers_ipaddr);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.mov_in_deptcd);
		cstmt.setString(14, dm.matr_cd);
		cstmt.setString(15, dm.mov_out_unit);
		cstmt.setString(16, dm.mov_out_qunt);
		cstmt.setString(17, dm.mov_out_uprc);
		cstmt.setString(18, dm.mov_out_amt);
		cstmt.setString(19, dm.mov_out_vat);
		cstmt.setString(20, dm.mov_out_budg_cd);
		cstmt.setString(21, dm.mov_in_unit);
		cstmt.setString(22, dm.mov_in_qunt);
		cstmt.setString(23, dm.mov_in_uprc);
		cstmt.setString(24, dm.mov_in_amt);
		cstmt.setString(25, dm.mov_in_vat);
		cstmt.setString(26, dm.mov_in_budg_cd);
		cstmt.setString(27, dm.medi_cd);
		cstmt.setString(28, dm.medi_ser_no);
		cstmt.setString(29, dm.remk);
		cstmt.setString(30, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_2006_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("mov_inout_dt = [" + getMov_inout_dt() + "]");
		System.out.println("mov_out_fac_cd = [" + getMov_out_fac_cd() + "]");
		System.out.println("mov_out_deptcd = [" + getMov_out_deptcd() + "]");
		System.out.println("mov_in_fac_cd = [" + getMov_in_fac_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mov_in_deptcd = [" + getMov_in_deptcd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("mov_out_unit = [" + getMov_out_unit() + "]");
		System.out.println("mov_out_qunt = [" + getMov_out_qunt() + "]");
		System.out.println("mov_out_uprc = [" + getMov_out_uprc() + "]");
		System.out.println("mov_out_amt = [" + getMov_out_amt() + "]");
		System.out.println("mov_out_vat = [" + getMov_out_vat() + "]");
		System.out.println("mov_out_budg_cd = [" + getMov_out_budg_cd() + "]");
		System.out.println("mov_in_unit = [" + getMov_in_unit() + "]");
		System.out.println("mov_in_qunt = [" + getMov_in_qunt() + "]");
		System.out.println("mov_in_uprc = [" + getMov_in_uprc() + "]");
		System.out.println("mov_in_amt = [" + getMov_in_amt() + "]");
		System.out.println("mov_in_vat = [" + getMov_in_vat() + "]");
		System.out.println("mov_in_budg_cd = [" + getMov_in_budg_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("medi_ser_no = [" + getMedi_ser_no() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String mov_inout_dt = req.getParameter("mov_inout_dt");
if( mov_inout_dt == null){
	System.out.println(this.toString+" : mov_inout_dt is null" );
}else{
	System.out.println(this.toString+" : mov_inout_dt is "+mov_inout_dt );
}
String mov_out_fac_cd = req.getParameter("mov_out_fac_cd");
if( mov_out_fac_cd == null){
	System.out.println(this.toString+" : mov_out_fac_cd is null" );
}else{
	System.out.println(this.toString+" : mov_out_fac_cd is "+mov_out_fac_cd );
}
String mov_out_deptcd = req.getParameter("mov_out_deptcd");
if( mov_out_deptcd == null){
	System.out.println(this.toString+" : mov_out_deptcd is null" );
}else{
	System.out.println(this.toString+" : mov_out_deptcd is "+mov_out_deptcd );
}
String mov_in_fac_cd = req.getParameter("mov_in_fac_cd");
if( mov_in_fac_cd == null){
	System.out.println(this.toString+" : mov_in_fac_cd is null" );
}else{
	System.out.println(this.toString+" : mov_in_fac_cd is "+mov_in_fac_cd );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mov_in_deptcd = req.getParameter("mov_in_deptcd");
if( mov_in_deptcd == null){
	System.out.println(this.toString+" : mov_in_deptcd is null" );
}else{
	System.out.println(this.toString+" : mov_in_deptcd is "+mov_in_deptcd );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String mov_out_unit = req.getParameter("mov_out_unit");
if( mov_out_unit == null){
	System.out.println(this.toString+" : mov_out_unit is null" );
}else{
	System.out.println(this.toString+" : mov_out_unit is "+mov_out_unit );
}
String mov_out_qunt = req.getParameter("mov_out_qunt");
if( mov_out_qunt == null){
	System.out.println(this.toString+" : mov_out_qunt is null" );
}else{
	System.out.println(this.toString+" : mov_out_qunt is "+mov_out_qunt );
}
String mov_out_uprc = req.getParameter("mov_out_uprc");
if( mov_out_uprc == null){
	System.out.println(this.toString+" : mov_out_uprc is null" );
}else{
	System.out.println(this.toString+" : mov_out_uprc is "+mov_out_uprc );
}
String mov_out_amt = req.getParameter("mov_out_amt");
if( mov_out_amt == null){
	System.out.println(this.toString+" : mov_out_amt is null" );
}else{
	System.out.println(this.toString+" : mov_out_amt is "+mov_out_amt );
}
String mov_out_vat = req.getParameter("mov_out_vat");
if( mov_out_vat == null){
	System.out.println(this.toString+" : mov_out_vat is null" );
}else{
	System.out.println(this.toString+" : mov_out_vat is "+mov_out_vat );
}
String mov_out_budg_cd = req.getParameter("mov_out_budg_cd");
if( mov_out_budg_cd == null){
	System.out.println(this.toString+" : mov_out_budg_cd is null" );
}else{
	System.out.println(this.toString+" : mov_out_budg_cd is "+mov_out_budg_cd );
}
String mov_in_unit = req.getParameter("mov_in_unit");
if( mov_in_unit == null){
	System.out.println(this.toString+" : mov_in_unit is null" );
}else{
	System.out.println(this.toString+" : mov_in_unit is "+mov_in_unit );
}
String mov_in_qunt = req.getParameter("mov_in_qunt");
if( mov_in_qunt == null){
	System.out.println(this.toString+" : mov_in_qunt is null" );
}else{
	System.out.println(this.toString+" : mov_in_qunt is "+mov_in_qunt );
}
String mov_in_uprc = req.getParameter("mov_in_uprc");
if( mov_in_uprc == null){
	System.out.println(this.toString+" : mov_in_uprc is null" );
}else{
	System.out.println(this.toString+" : mov_in_uprc is "+mov_in_uprc );
}
String mov_in_amt = req.getParameter("mov_in_amt");
if( mov_in_amt == null){
	System.out.println(this.toString+" : mov_in_amt is null" );
}else{
	System.out.println(this.toString+" : mov_in_amt is "+mov_in_amt );
}
String mov_in_vat = req.getParameter("mov_in_vat");
if( mov_in_vat == null){
	System.out.println(this.toString+" : mov_in_vat is null" );
}else{
	System.out.println(this.toString+" : mov_in_vat is "+mov_in_vat );
}
String mov_in_budg_cd = req.getParameter("mov_in_budg_cd");
if( mov_in_budg_cd == null){
	System.out.println(this.toString+" : mov_in_budg_cd is null" );
}else{
	System.out.println(this.toString+" : mov_in_budg_cd is "+mov_in_budg_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_ser_no = req.getParameter("medi_ser_no");
if( medi_ser_no == null){
	System.out.println(this.toString+" : medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no is "+medi_ser_no );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String mov_inout_dt = Util.checkString(req.getParameter("mov_inout_dt"));
String mov_out_fac_cd = Util.checkString(req.getParameter("mov_out_fac_cd"));
String mov_out_deptcd = Util.checkString(req.getParameter("mov_out_deptcd"));
String mov_in_fac_cd = Util.checkString(req.getParameter("mov_in_fac_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mov_in_deptcd = Util.checkString(req.getParameter("mov_in_deptcd"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String mov_out_unit = Util.checkString(req.getParameter("mov_out_unit"));
String mov_out_qunt = Util.checkString(req.getParameter("mov_out_qunt"));
String mov_out_uprc = Util.checkString(req.getParameter("mov_out_uprc"));
String mov_out_amt = Util.checkString(req.getParameter("mov_out_amt"));
String mov_out_vat = Util.checkString(req.getParameter("mov_out_vat"));
String mov_out_budg_cd = Util.checkString(req.getParameter("mov_out_budg_cd"));
String mov_in_unit = Util.checkString(req.getParameter("mov_in_unit"));
String mov_in_qunt = Util.checkString(req.getParameter("mov_in_qunt"));
String mov_in_uprc = Util.checkString(req.getParameter("mov_in_uprc"));
String mov_in_amt = Util.checkString(req.getParameter("mov_in_amt"));
String mov_in_vat = Util.checkString(req.getParameter("mov_in_vat"));
String mov_in_budg_cd = Util.checkString(req.getParameter("mov_in_budg_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String remk = Util.checkString(req.getParameter("remk"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String mov_inout_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_inout_dt")));
String mov_out_fac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_fac_cd")));
String mov_out_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_deptcd")));
String mov_in_fac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_fac_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mov_in_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_deptcd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String mov_out_unit = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_unit")));
String mov_out_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_qunt")));
String mov_out_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_uprc")));
String mov_out_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_amt")));
String mov_out_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_vat")));
String mov_out_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_out_budg_cd")));
String mov_in_unit = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_unit")));
String mov_in_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_qunt")));
String mov_in_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_uprc")));
String mov_in_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_amt")));
String mov_in_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_vat")));
String mov_in_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_in_budg_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setMov_inout_dt(mov_inout_dt);
dm.setMov_out_fac_cd(mov_out_fac_cd);
dm.setMov_out_deptcd(mov_out_deptcd);
dm.setMov_in_fac_cd(mov_in_fac_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMov_in_deptcd(mov_in_deptcd);
dm.setMatr_cd(matr_cd);
dm.setMov_out_unit(mov_out_unit);
dm.setMov_out_qunt(mov_out_qunt);
dm.setMov_out_uprc(mov_out_uprc);
dm.setMov_out_amt(mov_out_amt);
dm.setMov_out_vat(mov_out_vat);
dm.setMov_out_budg_cd(mov_out_budg_cd);
dm.setMov_in_unit(mov_in_unit);
dm.setMov_in_qunt(mov_in_qunt);
dm.setMov_in_uprc(mov_in_uprc);
dm.setMov_in_amt(mov_in_amt);
dm.setMov_in_vat(mov_in_vat);
dm.setMov_in_budg_cd(mov_in_budg_cd);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setRemk(remk);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 14:24:02 KST 2009 */