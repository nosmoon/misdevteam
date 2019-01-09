/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5243_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String schir_seq;
	public String scl_clsf;
	public String scl_cd;
	public String scl_nm;
	public String enty_dt;
	public String grdu_dt;
	public String grdu_clsf;
	public String degr_cd;
	public String majr_clsf_1;
	public String majr_cd_1;
	public String majr_nm_1;
	public String majr_clsf_2;
	public String majr_cd_2;
	public String majr_nm_2;
	public String majr_clsf_3;
	public String majr_cd_3;
	public String majr_nm_3;
	public String sclgg_kind_cd;
	public String plcw_cd;
	public String natn_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String proc_stat;
	public String proc_stat_req;
	public String gubun;

	public HD_INFO_5243_ADM(){}
	public HD_INFO_5243_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String schir_seq, String scl_clsf, String scl_cd, String scl_nm, String enty_dt, String grdu_dt, String grdu_clsf, String degr_cd, String majr_clsf_1, String majr_cd_1, String majr_nm_1, String majr_clsf_2, String majr_cd_2, String majr_nm_2, String majr_clsf_3, String majr_cd_3, String majr_nm_3, String sclgg_kind_cd, String plcw_cd, String natn_cd, String incmg_pers_ipadd, String incmg_pers, String proc_stat, String proc_stat_req, String gubun){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.schir_seq = schir_seq;
		this.scl_clsf = scl_clsf;
		this.scl_cd = scl_cd;
		this.scl_nm = scl_nm;
		this.enty_dt = enty_dt;
		this.grdu_dt = grdu_dt;
		this.grdu_clsf = grdu_clsf;
		this.degr_cd = degr_cd;
		this.majr_clsf_1 = majr_clsf_1;
		this.majr_cd_1 = majr_cd_1;
		this.majr_nm_1 = majr_nm_1;
		this.majr_clsf_2 = majr_clsf_2;
		this.majr_cd_2 = majr_cd_2;
		this.majr_nm_2 = majr_nm_2;
		this.majr_clsf_3 = majr_clsf_3;
		this.majr_cd_3 = majr_cd_3;
		this.majr_nm_3 = majr_nm_3;
		this.sclgg_kind_cd = sclgg_kind_cd;
		this.plcw_cd = plcw_cd;
		this.natn_cd = natn_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.proc_stat = proc_stat;
		this.proc_stat_req = proc_stat_req;
		this.gubun = gubun;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSchir_seq(String schir_seq){
		this.schir_seq = schir_seq;
	}

	public void setScl_clsf(String scl_clsf){
		this.scl_clsf = scl_clsf;
	}

	public void setScl_cd(String scl_cd){
		this.scl_cd = scl_cd;
	}

	public void setScl_nm(String scl_nm){
		this.scl_nm = scl_nm;
	}

	public void setEnty_dt(String enty_dt){
		this.enty_dt = enty_dt;
	}

	public void setGrdu_dt(String grdu_dt){
		this.grdu_dt = grdu_dt;
	}

	public void setGrdu_clsf(String grdu_clsf){
		this.grdu_clsf = grdu_clsf;
	}

	public void setDegr_cd(String degr_cd){
		this.degr_cd = degr_cd;
	}

	public void setMajr_clsf_1(String majr_clsf_1){
		this.majr_clsf_1 = majr_clsf_1;
	}

	public void setMajr_cd_1(String majr_cd_1){
		this.majr_cd_1 = majr_cd_1;
	}

	public void setMajr_nm_1(String majr_nm_1){
		this.majr_nm_1 = majr_nm_1;
	}

	public void setMajr_clsf_2(String majr_clsf_2){
		this.majr_clsf_2 = majr_clsf_2;
	}

	public void setMajr_cd_2(String majr_cd_2){
		this.majr_cd_2 = majr_cd_2;
	}

	public void setMajr_nm_2(String majr_nm_2){
		this.majr_nm_2 = majr_nm_2;
	}

	public void setMajr_clsf_3(String majr_clsf_3){
		this.majr_clsf_3 = majr_clsf_3;
	}

	public void setMajr_cd_3(String majr_cd_3){
		this.majr_cd_3 = majr_cd_3;
	}

	public void setMajr_nm_3(String majr_nm_3){
		this.majr_nm_3 = majr_nm_3;
	}

	public void setSclgg_kind_cd(String sclgg_kind_cd){
		this.sclgg_kind_cd = sclgg_kind_cd;
	}

	public void setPlcw_cd(String plcw_cd){
		this.plcw_cd = plcw_cd;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_req(String proc_stat_req){
		this.proc_stat_req = proc_stat_req;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSchir_seq(){
		return this.schir_seq;
	}

	public String getScl_clsf(){
		return this.scl_clsf;
	}

	public String getScl_cd(){
		return this.scl_cd;
	}

	public String getScl_nm(){
		return this.scl_nm;
	}

	public String getEnty_dt(){
		return this.enty_dt;
	}

	public String getGrdu_dt(){
		return this.grdu_dt;
	}

	public String getGrdu_clsf(){
		return this.grdu_clsf;
	}

	public String getDegr_cd(){
		return this.degr_cd;
	}

	public String getMajr_clsf_1(){
		return this.majr_clsf_1;
	}

	public String getMajr_cd_1(){
		return this.majr_cd_1;
	}

	public String getMajr_nm_1(){
		return this.majr_nm_1;
	}

	public String getMajr_clsf_2(){
		return this.majr_clsf_2;
	}

	public String getMajr_cd_2(){
		return this.majr_cd_2;
	}

	public String getMajr_nm_2(){
		return this.majr_nm_2;
	}

	public String getMajr_clsf_3(){
		return this.majr_clsf_3;
	}

	public String getMajr_cd_3(){
		return this.majr_cd_3;
	}

	public String getMajr_nm_3(){
		return this.majr_nm_3;
	}

	public String getSclgg_kind_cd(){
		return this.sclgg_kind_cd;
	}

	public String getPlcw_cd(){
		return this.plcw_cd;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_req(){
		return this.proc_stat_req;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_5243_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_5243_ADM dm = (HD_INFO_5243_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.schir_seq);
		cstmt.setString(9, dm.scl_clsf);
		cstmt.setString(10, dm.scl_cd);
		cstmt.setString(11, dm.scl_nm);
		cstmt.setString(12, dm.enty_dt);
		cstmt.setString(13, dm.grdu_dt);
		cstmt.setString(14, dm.grdu_clsf);
		cstmt.setString(15, dm.degr_cd);
		cstmt.setString(16, dm.majr_clsf_1);
		cstmt.setString(17, dm.majr_cd_1);
		cstmt.setString(18, dm.majr_nm_1);
		cstmt.setString(19, dm.majr_clsf_2);
		cstmt.setString(20, dm.majr_cd_2);
		cstmt.setString(21, dm.majr_nm_2);
		cstmt.setString(22, dm.majr_clsf_3);
		cstmt.setString(23, dm.majr_cd_3);
		cstmt.setString(24, dm.majr_nm_3);
		cstmt.setString(25, dm.sclgg_kind_cd);
		cstmt.setString(26, dm.plcw_cd);
		cstmt.setString(27, dm.natn_cd);
		cstmt.setString(28, dm.incmg_pers_ipadd);
		cstmt.setString(29, dm.incmg_pers);
		cstmt.setString(30, dm.proc_stat);
		cstmt.setString(31, dm.proc_stat_req);
		cstmt.setString(32, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_5243_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("schir_seq = [" + getSchir_seq() + "]");
		System.out.println("scl_clsf = [" + getScl_clsf() + "]");
		System.out.println("scl_cd = [" + getScl_cd() + "]");
		System.out.println("scl_nm = [" + getScl_nm() + "]");
		System.out.println("enty_dt = [" + getEnty_dt() + "]");
		System.out.println("grdu_dt = [" + getGrdu_dt() + "]");
		System.out.println("grdu_clsf = [" + getGrdu_clsf() + "]");
		System.out.println("degr_cd = [" + getDegr_cd() + "]");
		System.out.println("majr_clsf_1 = [" + getMajr_clsf_1() + "]");
		System.out.println("majr_cd_1 = [" + getMajr_cd_1() + "]");
		System.out.println("majr_nm_1 = [" + getMajr_nm_1() + "]");
		System.out.println("majr_clsf_2 = [" + getMajr_clsf_2() + "]");
		System.out.println("majr_cd_2 = [" + getMajr_cd_2() + "]");
		System.out.println("majr_nm_2 = [" + getMajr_nm_2() + "]");
		System.out.println("majr_clsf_3 = [" + getMajr_clsf_3() + "]");
		System.out.println("majr_cd_3 = [" + getMajr_cd_3() + "]");
		System.out.println("majr_nm_3 = [" + getMajr_nm_3() + "]");
		System.out.println("sclgg_kind_cd = [" + getSclgg_kind_cd() + "]");
		System.out.println("plcw_cd = [" + getPlcw_cd() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("proc_stat_req = [" + getProc_stat_req() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
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
String schir_seq = req.getParameter("schir_seq");
if( schir_seq == null){
	System.out.println(this.toString+" : schir_seq is null" );
}else{
	System.out.println(this.toString+" : schir_seq is "+schir_seq );
}
String scl_clsf = req.getParameter("scl_clsf");
if( scl_clsf == null){
	System.out.println(this.toString+" : scl_clsf is null" );
}else{
	System.out.println(this.toString+" : scl_clsf is "+scl_clsf );
}
String scl_cd = req.getParameter("scl_cd");
if( scl_cd == null){
	System.out.println(this.toString+" : scl_cd is null" );
}else{
	System.out.println(this.toString+" : scl_cd is "+scl_cd );
}
String scl_nm = req.getParameter("scl_nm");
if( scl_nm == null){
	System.out.println(this.toString+" : scl_nm is null" );
}else{
	System.out.println(this.toString+" : scl_nm is "+scl_nm );
}
String enty_dt = req.getParameter("enty_dt");
if( enty_dt == null){
	System.out.println(this.toString+" : enty_dt is null" );
}else{
	System.out.println(this.toString+" : enty_dt is "+enty_dt );
}
String grdu_dt = req.getParameter("grdu_dt");
if( grdu_dt == null){
	System.out.println(this.toString+" : grdu_dt is null" );
}else{
	System.out.println(this.toString+" : grdu_dt is "+grdu_dt );
}
String grdu_clsf = req.getParameter("grdu_clsf");
if( grdu_clsf == null){
	System.out.println(this.toString+" : grdu_clsf is null" );
}else{
	System.out.println(this.toString+" : grdu_clsf is "+grdu_clsf );
}
String degr_cd = req.getParameter("degr_cd");
if( degr_cd == null){
	System.out.println(this.toString+" : degr_cd is null" );
}else{
	System.out.println(this.toString+" : degr_cd is "+degr_cd );
}
String majr_clsf_1 = req.getParameter("majr_clsf_1");
if( majr_clsf_1 == null){
	System.out.println(this.toString+" : majr_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : majr_clsf_1 is "+majr_clsf_1 );
}
String majr_cd_1 = req.getParameter("majr_cd_1");
if( majr_cd_1 == null){
	System.out.println(this.toString+" : majr_cd_1 is null" );
}else{
	System.out.println(this.toString+" : majr_cd_1 is "+majr_cd_1 );
}
String majr_nm_1 = req.getParameter("majr_nm_1");
if( majr_nm_1 == null){
	System.out.println(this.toString+" : majr_nm_1 is null" );
}else{
	System.out.println(this.toString+" : majr_nm_1 is "+majr_nm_1 );
}
String majr_clsf_2 = req.getParameter("majr_clsf_2");
if( majr_clsf_2 == null){
	System.out.println(this.toString+" : majr_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : majr_clsf_2 is "+majr_clsf_2 );
}
String majr_cd_2 = req.getParameter("majr_cd_2");
if( majr_cd_2 == null){
	System.out.println(this.toString+" : majr_cd_2 is null" );
}else{
	System.out.println(this.toString+" : majr_cd_2 is "+majr_cd_2 );
}
String majr_nm_2 = req.getParameter("majr_nm_2");
if( majr_nm_2 == null){
	System.out.println(this.toString+" : majr_nm_2 is null" );
}else{
	System.out.println(this.toString+" : majr_nm_2 is "+majr_nm_2 );
}
String majr_clsf_3 = req.getParameter("majr_clsf_3");
if( majr_clsf_3 == null){
	System.out.println(this.toString+" : majr_clsf_3 is null" );
}else{
	System.out.println(this.toString+" : majr_clsf_3 is "+majr_clsf_3 );
}
String majr_cd_3 = req.getParameter("majr_cd_3");
if( majr_cd_3 == null){
	System.out.println(this.toString+" : majr_cd_3 is null" );
}else{
	System.out.println(this.toString+" : majr_cd_3 is "+majr_cd_3 );
}
String majr_nm_3 = req.getParameter("majr_nm_3");
if( majr_nm_3 == null){
	System.out.println(this.toString+" : majr_nm_3 is null" );
}else{
	System.out.println(this.toString+" : majr_nm_3 is "+majr_nm_3 );
}
String sclgg_kind_cd = req.getParameter("sclgg_kind_cd");
if( sclgg_kind_cd == null){
	System.out.println(this.toString+" : sclgg_kind_cd is null" );
}else{
	System.out.println(this.toString+" : sclgg_kind_cd is "+sclgg_kind_cd );
}
String plcw_cd = req.getParameter("plcw_cd");
if( plcw_cd == null){
	System.out.println(this.toString+" : plcw_cd is null" );
}else{
	System.out.println(this.toString+" : plcw_cd is "+plcw_cd );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String proc_stat_req = req.getParameter("proc_stat_req");
if( proc_stat_req == null){
	System.out.println(this.toString+" : proc_stat_req is null" );
}else{
	System.out.println(this.toString+" : proc_stat_req is "+proc_stat_req );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String schir_seq = Util.checkString(req.getParameter("schir_seq"));
String scl_clsf = Util.checkString(req.getParameter("scl_clsf"));
String scl_cd = Util.checkString(req.getParameter("scl_cd"));
String scl_nm = Util.checkString(req.getParameter("scl_nm"));
String enty_dt = Util.checkString(req.getParameter("enty_dt"));
String grdu_dt = Util.checkString(req.getParameter("grdu_dt"));
String grdu_clsf = Util.checkString(req.getParameter("grdu_clsf"));
String degr_cd = Util.checkString(req.getParameter("degr_cd"));
String majr_clsf_1 = Util.checkString(req.getParameter("majr_clsf_1"));
String majr_cd_1 = Util.checkString(req.getParameter("majr_cd_1"));
String majr_nm_1 = Util.checkString(req.getParameter("majr_nm_1"));
String majr_clsf_2 = Util.checkString(req.getParameter("majr_clsf_2"));
String majr_cd_2 = Util.checkString(req.getParameter("majr_cd_2"));
String majr_nm_2 = Util.checkString(req.getParameter("majr_nm_2"));
String majr_clsf_3 = Util.checkString(req.getParameter("majr_clsf_3"));
String majr_cd_3 = Util.checkString(req.getParameter("majr_cd_3"));
String majr_nm_3 = Util.checkString(req.getParameter("majr_nm_3"));
String sclgg_kind_cd = Util.checkString(req.getParameter("sclgg_kind_cd"));
String plcw_cd = Util.checkString(req.getParameter("plcw_cd"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String proc_stat_req = Util.checkString(req.getParameter("proc_stat_req"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String schir_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("schir_seq")));
String scl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_clsf")));
String scl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_cd")));
String scl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("scl_nm")));
String enty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("enty_dt")));
String grdu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("grdu_dt")));
String grdu_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("grdu_clsf")));
String degr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("degr_cd")));
String majr_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_clsf_1")));
String majr_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_cd_1")));
String majr_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_nm_1")));
String majr_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_clsf_2")));
String majr_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_cd_2")));
String majr_nm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_nm_2")));
String majr_clsf_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_clsf_3")));
String majr_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_cd_3")));
String majr_nm_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("majr_nm_3")));
String sclgg_kind_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sclgg_kind_cd")));
String plcw_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("plcw_cd")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String proc_stat_req = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_req")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSchir_seq(schir_seq);
dm.setScl_clsf(scl_clsf);
dm.setScl_cd(scl_cd);
dm.setScl_nm(scl_nm);
dm.setEnty_dt(enty_dt);
dm.setGrdu_dt(grdu_dt);
dm.setGrdu_clsf(grdu_clsf);
dm.setDegr_cd(degr_cd);
dm.setMajr_clsf_1(majr_clsf_1);
dm.setMajr_cd_1(majr_cd_1);
dm.setMajr_nm_1(majr_nm_1);
dm.setMajr_clsf_2(majr_clsf_2);
dm.setMajr_cd_2(majr_cd_2);
dm.setMajr_nm_2(majr_nm_2);
dm.setMajr_clsf_3(majr_clsf_3);
dm.setMajr_cd_3(majr_cd_3);
dm.setMajr_nm_3(majr_nm_3);
dm.setSclgg_kind_cd(sclgg_kind_cd);
dm.setPlcw_cd(plcw_cd);
dm.setNatn_cd(natn_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setProc_stat(proc_stat);
dm.setProc_stat_req(proc_stat_req);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 14 21:12:58 KST 2009 */