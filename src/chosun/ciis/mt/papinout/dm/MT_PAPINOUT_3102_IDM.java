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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_3102_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String fac_clsf;
	public String pers_ipaddr;
	public String pers_id;
	public String coll_yn_ar;
	public String papcmpy_cd_ar;
	public String medi_cd_ar;
	public String sect_cd_ar;
	public String a_wgt_ar;
	public String b_wgt_ar;
	public String c_wgt_ar;
	public String a_roll_ar;
	public String b_roll_ar;
	public String c_roll_ar;
	public String a_wgt_l_ar;
	public String b_wgt_l_ar;
	public String c_wgt_l_ar;
	public String prt_clsf_ar;
	public String papcmpy_cd2_ar;
	public String medi_cd2_ar;
	public String sect_cd2_ar;
	public String a_wgt2_ar;
	public String b_wgt2_ar;
	public String c_wgt2_ar;
	public String prt_clsf2_ar;
	public String occr_dt2_ar;
	public String seq2_ar;
	public String sub_seq2_ar;

	public MT_PAPINOUT_3102_IDM(){}
	public MT_PAPINOUT_3102_IDM(String cmpy_cd, String issu_dt, String fac_clsf, String pers_ipaddr, String pers_id, String coll_yn_ar, String papcmpy_cd_ar, String medi_cd_ar, String sect_cd_ar, String a_wgt_ar, String b_wgt_ar, String c_wgt_ar, String a_roll_ar, String b_roll_ar, String c_roll_ar, String a_wgt_l_ar, String b_wgt_l_ar, String c_wgt_l_ar, String prt_clsf_ar, String papcmpy_cd2_ar, String medi_cd2_ar, String sect_cd2_ar, String a_wgt2_ar, String b_wgt2_ar, String c_wgt2_ar, String prt_clsf2_ar, String occr_dt2_ar, String seq2_ar, String sub_seq2_ar){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.pers_ipaddr = pers_ipaddr;
		this.pers_id = pers_id;
		this.coll_yn_ar = coll_yn_ar;
		this.papcmpy_cd_ar = papcmpy_cd_ar;
		this.medi_cd_ar = medi_cd_ar;
		this.sect_cd_ar = sect_cd_ar;
		this.a_wgt_ar = a_wgt_ar;
		this.b_wgt_ar = b_wgt_ar;
		this.c_wgt_ar = c_wgt_ar;
		this.a_roll_ar = a_roll_ar;
		this.b_roll_ar = b_roll_ar;
		this.c_roll_ar = c_roll_ar;
		this.a_wgt_l_ar = a_wgt_l_ar;
		this.b_wgt_l_ar = b_wgt_l_ar;
		this.c_wgt_l_ar = c_wgt_l_ar;
		this.prt_clsf_ar = prt_clsf_ar;
		this.papcmpy_cd2_ar = papcmpy_cd2_ar;
		this.medi_cd2_ar = medi_cd2_ar;
		this.sect_cd2_ar = sect_cd2_ar;
		this.a_wgt2_ar = a_wgt2_ar;
		this.b_wgt2_ar = b_wgt2_ar;
		this.c_wgt2_ar = c_wgt2_ar;
		this.prt_clsf2_ar = prt_clsf2_ar;
		this.occr_dt2_ar = occr_dt2_ar;
		this.seq2_ar = seq2_ar;
		this.sub_seq2_ar = sub_seq2_ar;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public void setColl_yn_ar(String coll_yn_ar){
		this.coll_yn_ar = coll_yn_ar;
	}

	public void setPapcmpy_cd_ar(String papcmpy_cd_ar){
		this.papcmpy_cd_ar = papcmpy_cd_ar;
	}

	public void setMedi_cd_ar(String medi_cd_ar){
		this.medi_cd_ar = medi_cd_ar;
	}

	public void setSect_cd_ar(String sect_cd_ar){
		this.sect_cd_ar = sect_cd_ar;
	}

	public void setA_wgt_ar(String a_wgt_ar){
		this.a_wgt_ar = a_wgt_ar;
	}

	public void setB_wgt_ar(String b_wgt_ar){
		this.b_wgt_ar = b_wgt_ar;
	}

	public void setC_wgt_ar(String c_wgt_ar){
		this.c_wgt_ar = c_wgt_ar;
	}

	public void setA_roll_ar(String a_roll_ar){
		this.a_roll_ar = a_roll_ar;
	}

	public void setB_roll_ar(String b_roll_ar){
		this.b_roll_ar = b_roll_ar;
	}

	public void setC_roll_ar(String c_roll_ar){
		this.c_roll_ar = c_roll_ar;
	}

	public void setA_wgt_l_ar(String a_wgt_l_ar){
		this.a_wgt_l_ar = a_wgt_l_ar;
	}

	public void setB_wgt_l_ar(String b_wgt_l_ar){
		this.b_wgt_l_ar = b_wgt_l_ar;
	}

	public void setC_wgt_l_ar(String c_wgt_l_ar){
		this.c_wgt_l_ar = c_wgt_l_ar;
	}

	public void setPrt_clsf_ar(String prt_clsf_ar){
		this.prt_clsf_ar = prt_clsf_ar;
	}

	public void setPapcmpy_cd2_ar(String papcmpy_cd2_ar){
		this.papcmpy_cd2_ar = papcmpy_cd2_ar;
	}

	public void setMedi_cd2_ar(String medi_cd2_ar){
		this.medi_cd2_ar = medi_cd2_ar;
	}

	public void setSect_cd2_ar(String sect_cd2_ar){
		this.sect_cd2_ar = sect_cd2_ar;
	}

	public void setA_wgt2_ar(String a_wgt2_ar){
		this.a_wgt2_ar = a_wgt2_ar;
	}

	public void setB_wgt2_ar(String b_wgt2_ar){
		this.b_wgt2_ar = b_wgt2_ar;
	}

	public void setC_wgt2_ar(String c_wgt2_ar){
		this.c_wgt2_ar = c_wgt2_ar;
	}

	public void setPrt_clsf2_ar(String prt_clsf2_ar){
		this.prt_clsf2_ar = prt_clsf2_ar;
	}

	public void setOccr_dt2_ar(String occr_dt2_ar){
		this.occr_dt2_ar = occr_dt2_ar;
	}

	public void setSeq2_ar(String seq2_ar){
		this.seq2_ar = seq2_ar;
	}

	public void setSub_seq2_ar(String sub_seq2_ar){
		this.sub_seq2_ar = sub_seq2_ar;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getColl_yn_ar(){
		return this.coll_yn_ar;
	}

	public String getPapcmpy_cd_ar(){
		return this.papcmpy_cd_ar;
	}

	public String getMedi_cd_ar(){
		return this.medi_cd_ar;
	}

	public String getSect_cd_ar(){
		return this.sect_cd_ar;
	}

	public String getA_wgt_ar(){
		return this.a_wgt_ar;
	}

	public String getB_wgt_ar(){
		return this.b_wgt_ar;
	}

	public String getC_wgt_ar(){
		return this.c_wgt_ar;
	}

	public String getA_roll_ar(){
		return this.a_roll_ar;
	}

	public String getB_roll_ar(){
		return this.b_roll_ar;
	}

	public String getC_roll_ar(){
		return this.c_roll_ar;
	}

	public String getA_wgt_l_ar(){
		return this.a_wgt_l_ar;
	}

	public String getB_wgt_l_ar(){
		return this.b_wgt_l_ar;
	}

	public String getC_wgt_l_ar(){
		return this.c_wgt_l_ar;
	}

	public String getPrt_clsf_ar(){
		return this.prt_clsf_ar;
	}

	public String getPapcmpy_cd2_ar(){
		return this.papcmpy_cd2_ar;
	}

	public String getMedi_cd2_ar(){
		return this.medi_cd2_ar;
	}

	public String getSect_cd2_ar(){
		return this.sect_cd2_ar;
	}

	public String getA_wgt2_ar(){
		return this.a_wgt2_ar;
	}

	public String getB_wgt2_ar(){
		return this.b_wgt2_ar;
	}

	public String getC_wgt2_ar(){
		return this.c_wgt2_ar;
	}

	public String getPrt_clsf2_ar(){
		return this.prt_clsf2_ar;
	}

	public String getOccr_dt2_ar(){
		return this.occr_dt2_ar;
	}

	public String getSeq2_ar(){
		return this.seq2_ar;
	}

	public String getSub_seq2_ar(){
		return this.sub_seq2_ar;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_3102_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_3102_IDM dm = (MT_PAPINOUT_3102_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.pers_ipaddr);
		cstmt.setString(7, dm.pers_id);
		cstmt.setString(8, dm.coll_yn_ar);
		cstmt.setString(9, dm.papcmpy_cd_ar);
		cstmt.setString(10, dm.medi_cd_ar);
		cstmt.setString(11, dm.sect_cd_ar);
		cstmt.setString(12, dm.a_wgt_ar);
		cstmt.setString(13, dm.b_wgt_ar);
		cstmt.setString(14, dm.c_wgt_ar);
		cstmt.setString(15, dm.a_roll_ar);
		cstmt.setString(16, dm.b_roll_ar);
		cstmt.setString(17, dm.c_roll_ar);
		cstmt.setString(18, dm.a_wgt_l_ar);
		cstmt.setString(19, dm.b_wgt_l_ar);
		cstmt.setString(20, dm.c_wgt_l_ar);
		cstmt.setString(21, dm.prt_clsf_ar);
		cstmt.setString(22, dm.papcmpy_cd2_ar);
		cstmt.setString(23, dm.medi_cd2_ar);
		cstmt.setString(24, dm.sect_cd2_ar);
		cstmt.setString(25, dm.a_wgt2_ar);
		cstmt.setString(26, dm.b_wgt2_ar);
		cstmt.setString(27, dm.c_wgt2_ar);
		cstmt.setString(28, dm.prt_clsf2_ar);
		cstmt.setString(29, dm.occr_dt2_ar);
		cstmt.setString(30, dm.seq2_ar);
		cstmt.setString(31, dm.sub_seq2_ar);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_3102_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
		System.out.println("coll_yn_ar = [" + getColl_yn_ar() + "]");
		System.out.println("papcmpy_cd_ar = [" + getPapcmpy_cd_ar() + "]");
		System.out.println("medi_cd_ar = [" + getMedi_cd_ar() + "]");
		System.out.println("sect_cd_ar = [" + getSect_cd_ar() + "]");
		System.out.println("a_wgt_ar = [" + getA_wgt_ar() + "]");
		System.out.println("b_wgt_ar = [" + getB_wgt_ar() + "]");
		System.out.println("c_wgt_ar = [" + getC_wgt_ar() + "]");
		System.out.println("a_roll_ar = [" + getA_roll_ar() + "]");
		System.out.println("b_roll_ar = [" + getB_roll_ar() + "]");
		System.out.println("c_roll_ar = [" + getC_roll_ar() + "]");
		System.out.println("a_wgt_l_ar = [" + getA_wgt_l_ar() + "]");
		System.out.println("b_wgt_l_ar = [" + getB_wgt_l_ar() + "]");
		System.out.println("c_wgt_l_ar = [" + getC_wgt_l_ar() + "]");
		System.out.println("prt_clsf_ar = [" + getPrt_clsf_ar() + "]");
		System.out.println("papcmpy_cd2_ar = [" + getPapcmpy_cd2_ar() + "]");
		System.out.println("medi_cd2_ar = [" + getMedi_cd2_ar() + "]");
		System.out.println("sect_cd2_ar = [" + getSect_cd2_ar() + "]");
		System.out.println("a_wgt2_ar = [" + getA_wgt2_ar() + "]");
		System.out.println("b_wgt2_ar = [" + getB_wgt2_ar() + "]");
		System.out.println("c_wgt2_ar = [" + getC_wgt2_ar() + "]");
		System.out.println("prt_clsf2_ar = [" + getPrt_clsf2_ar() + "]");
		System.out.println("occr_dt2_ar = [" + getOccr_dt2_ar() + "]");
		System.out.println("seq2_ar = [" + getSeq2_ar() + "]");
		System.out.println("sub_seq2_ar = [" + getSub_seq2_ar() + "]");
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
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String pers_ipaddr = req.getParameter("pers_ipaddr");
if( pers_ipaddr == null){
	System.out.println(this.toString+" : pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : pers_ipaddr is "+pers_ipaddr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
String coll_yn_ar = req.getParameter("coll_yn_ar");
if( coll_yn_ar == null){
	System.out.println(this.toString+" : coll_yn_ar is null" );
}else{
	System.out.println(this.toString+" : coll_yn_ar is "+coll_yn_ar );
}
String papcmpy_cd_ar = req.getParameter("papcmpy_cd_ar");
if( papcmpy_cd_ar == null){
	System.out.println(this.toString+" : papcmpy_cd_ar is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd_ar is "+papcmpy_cd_ar );
}
String medi_cd_ar = req.getParameter("medi_cd_ar");
if( medi_cd_ar == null){
	System.out.println(this.toString+" : medi_cd_ar is null" );
}else{
	System.out.println(this.toString+" : medi_cd_ar is "+medi_cd_ar );
}
String sect_cd_ar = req.getParameter("sect_cd_ar");
if( sect_cd_ar == null){
	System.out.println(this.toString+" : sect_cd_ar is null" );
}else{
	System.out.println(this.toString+" : sect_cd_ar is "+sect_cd_ar );
}
String a_wgt_ar = req.getParameter("a_wgt_ar");
if( a_wgt_ar == null){
	System.out.println(this.toString+" : a_wgt_ar is null" );
}else{
	System.out.println(this.toString+" : a_wgt_ar is "+a_wgt_ar );
}
String b_wgt_ar = req.getParameter("b_wgt_ar");
if( b_wgt_ar == null){
	System.out.println(this.toString+" : b_wgt_ar is null" );
}else{
	System.out.println(this.toString+" : b_wgt_ar is "+b_wgt_ar );
}
String c_wgt_ar = req.getParameter("c_wgt_ar");
if( c_wgt_ar == null){
	System.out.println(this.toString+" : c_wgt_ar is null" );
}else{
	System.out.println(this.toString+" : c_wgt_ar is "+c_wgt_ar );
}
String a_roll_ar = req.getParameter("a_roll_ar");
if( a_roll_ar == null){
	System.out.println(this.toString+" : a_roll_ar is null" );
}else{
	System.out.println(this.toString+" : a_roll_ar is "+a_roll_ar );
}
String b_roll_ar = req.getParameter("b_roll_ar");
if( b_roll_ar == null){
	System.out.println(this.toString+" : b_roll_ar is null" );
}else{
	System.out.println(this.toString+" : b_roll_ar is "+b_roll_ar );
}
String c_roll_ar = req.getParameter("c_roll_ar");
if( c_roll_ar == null){
	System.out.println(this.toString+" : c_roll_ar is null" );
}else{
	System.out.println(this.toString+" : c_roll_ar is "+c_roll_ar );
}
String a_wgt_l_ar = req.getParameter("a_wgt_l_ar");
if( a_wgt_l_ar == null){
	System.out.println(this.toString+" : a_wgt_l_ar is null" );
}else{
	System.out.println(this.toString+" : a_wgt_l_ar is "+a_wgt_l_ar );
}
String b_wgt_l_ar = req.getParameter("b_wgt_l_ar");
if( b_wgt_l_ar == null){
	System.out.println(this.toString+" : b_wgt_l_ar is null" );
}else{
	System.out.println(this.toString+" : b_wgt_l_ar is "+b_wgt_l_ar );
}
String c_wgt_l_ar = req.getParameter("c_wgt_l_ar");
if( c_wgt_l_ar == null){
	System.out.println(this.toString+" : c_wgt_l_ar is null" );
}else{
	System.out.println(this.toString+" : c_wgt_l_ar is "+c_wgt_l_ar );
}
String prt_clsf_ar = req.getParameter("prt_clsf_ar");
if( prt_clsf_ar == null){
	System.out.println(this.toString+" : prt_clsf_ar is null" );
}else{
	System.out.println(this.toString+" : prt_clsf_ar is "+prt_clsf_ar );
}
String papcmpy_cd2_ar = req.getParameter("papcmpy_cd2_ar");
if( papcmpy_cd2_ar == null){
	System.out.println(this.toString+" : papcmpy_cd2_ar is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd2_ar is "+papcmpy_cd2_ar );
}
String medi_cd2_ar = req.getParameter("medi_cd2_ar");
if( medi_cd2_ar == null){
	System.out.println(this.toString+" : medi_cd2_ar is null" );
}else{
	System.out.println(this.toString+" : medi_cd2_ar is "+medi_cd2_ar );
}
String sect_cd2_ar = req.getParameter("sect_cd2_ar");
if( sect_cd2_ar == null){
	System.out.println(this.toString+" : sect_cd2_ar is null" );
}else{
	System.out.println(this.toString+" : sect_cd2_ar is "+sect_cd2_ar );
}
String a_wgt2_ar = req.getParameter("a_wgt2_ar");
if( a_wgt2_ar == null){
	System.out.println(this.toString+" : a_wgt2_ar is null" );
}else{
	System.out.println(this.toString+" : a_wgt2_ar is "+a_wgt2_ar );
}
String b_wgt2_ar = req.getParameter("b_wgt2_ar");
if( b_wgt2_ar == null){
	System.out.println(this.toString+" : b_wgt2_ar is null" );
}else{
	System.out.println(this.toString+" : b_wgt2_ar is "+b_wgt2_ar );
}
String c_wgt2_ar = req.getParameter("c_wgt2_ar");
if( c_wgt2_ar == null){
	System.out.println(this.toString+" : c_wgt2_ar is null" );
}else{
	System.out.println(this.toString+" : c_wgt2_ar is "+c_wgt2_ar );
}
String prt_clsf2_ar = req.getParameter("prt_clsf2_ar");
if( prt_clsf2_ar == null){
	System.out.println(this.toString+" : prt_clsf2_ar is null" );
}else{
	System.out.println(this.toString+" : prt_clsf2_ar is "+prt_clsf2_ar );
}
String occr_dt2_ar = req.getParameter("occr_dt2_ar");
if( occr_dt2_ar == null){
	System.out.println(this.toString+" : occr_dt2_ar is null" );
}else{
	System.out.println(this.toString+" : occr_dt2_ar is "+occr_dt2_ar );
}
String seq2_ar = req.getParameter("seq2_ar");
if( seq2_ar == null){
	System.out.println(this.toString+" : seq2_ar is null" );
}else{
	System.out.println(this.toString+" : seq2_ar is "+seq2_ar );
}
String sub_seq2_ar = req.getParameter("sub_seq2_ar");
if( sub_seq2_ar == null){
	System.out.println(this.toString+" : sub_seq2_ar is null" );
}else{
	System.out.println(this.toString+" : sub_seq2_ar is "+sub_seq2_ar );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
String coll_yn_ar = Util.checkString(req.getParameter("coll_yn_ar"));
String papcmpy_cd_ar = Util.checkString(req.getParameter("papcmpy_cd_ar"));
String medi_cd_ar = Util.checkString(req.getParameter("medi_cd_ar"));
String sect_cd_ar = Util.checkString(req.getParameter("sect_cd_ar"));
String a_wgt_ar = Util.checkString(req.getParameter("a_wgt_ar"));
String b_wgt_ar = Util.checkString(req.getParameter("b_wgt_ar"));
String c_wgt_ar = Util.checkString(req.getParameter("c_wgt_ar"));
String a_roll_ar = Util.checkString(req.getParameter("a_roll_ar"));
String b_roll_ar = Util.checkString(req.getParameter("b_roll_ar"));
String c_roll_ar = Util.checkString(req.getParameter("c_roll_ar"));
String a_wgt_l_ar = Util.checkString(req.getParameter("a_wgt_l_ar"));
String b_wgt_l_ar = Util.checkString(req.getParameter("b_wgt_l_ar"));
String c_wgt_l_ar = Util.checkString(req.getParameter("c_wgt_l_ar"));
String prt_clsf_ar = Util.checkString(req.getParameter("prt_clsf_ar"));
String papcmpy_cd2_ar = Util.checkString(req.getParameter("papcmpy_cd2_ar"));
String medi_cd2_ar = Util.checkString(req.getParameter("medi_cd2_ar"));
String sect_cd2_ar = Util.checkString(req.getParameter("sect_cd2_ar"));
String a_wgt2_ar = Util.checkString(req.getParameter("a_wgt2_ar"));
String b_wgt2_ar = Util.checkString(req.getParameter("b_wgt2_ar"));
String c_wgt2_ar = Util.checkString(req.getParameter("c_wgt2_ar"));
String prt_clsf2_ar = Util.checkString(req.getParameter("prt_clsf2_ar"));
String occr_dt2_ar = Util.checkString(req.getParameter("occr_dt2_ar"));
String seq2_ar = Util.checkString(req.getParameter("seq2_ar"));
String sub_seq2_ar = Util.checkString(req.getParameter("sub_seq2_ar"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
String coll_yn_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("coll_yn_ar")));
String papcmpy_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd_ar")));
String medi_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd_ar")));
String sect_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd_ar")));
String a_wgt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("a_wgt_ar")));
String b_wgt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("b_wgt_ar")));
String c_wgt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("c_wgt_ar")));
String a_roll_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("a_roll_ar")));
String b_roll_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("b_roll_ar")));
String c_roll_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("c_roll_ar")));
String a_wgt_l_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("a_wgt_l_ar")));
String b_wgt_l_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("b_wgt_l_ar")));
String c_wgt_l_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("c_wgt_l_ar")));
String prt_clsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf_ar")));
String papcmpy_cd2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd2_ar")));
String medi_cd2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd2_ar")));
String sect_cd2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd2_ar")));
String a_wgt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("a_wgt2_ar")));
String b_wgt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("b_wgt2_ar")));
String c_wgt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("c_wgt2_ar")));
String prt_clsf2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf2_ar")));
String occr_dt2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt2_ar")));
String seq2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("seq2_ar")));
String sub_seq2_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq2_ar")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers_id(pers_id);
dm.setColl_yn_ar(coll_yn_ar);
dm.setPapcmpy_cd_ar(papcmpy_cd_ar);
dm.setMedi_cd_ar(medi_cd_ar);
dm.setSect_cd_ar(sect_cd_ar);
dm.setA_wgt_ar(a_wgt_ar);
dm.setB_wgt_ar(b_wgt_ar);
dm.setC_wgt_ar(c_wgt_ar);
dm.setA_roll_ar(a_roll_ar);
dm.setB_roll_ar(b_roll_ar);
dm.setC_roll_ar(c_roll_ar);
dm.setA_wgt_l_ar(a_wgt_l_ar);
dm.setB_wgt_l_ar(b_wgt_l_ar);
dm.setC_wgt_l_ar(c_wgt_l_ar);
dm.setPrt_clsf_ar(prt_clsf_ar);
dm.setPapcmpy_cd2_ar(papcmpy_cd2_ar);
dm.setMedi_cd2_ar(medi_cd2_ar);
dm.setSect_cd2_ar(sect_cd2_ar);
dm.setA_wgt2_ar(a_wgt2_ar);
dm.setB_wgt2_ar(b_wgt2_ar);
dm.setC_wgt2_ar(c_wgt2_ar);
dm.setPrt_clsf2_ar(prt_clsf2_ar);
dm.setOccr_dt2_ar(occr_dt2_ar);
dm.setSeq2_ar(seq2_ar);
dm.setSub_seq2_ar(sub_seq2_ar);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 03 09:41:03 KST 2009 */