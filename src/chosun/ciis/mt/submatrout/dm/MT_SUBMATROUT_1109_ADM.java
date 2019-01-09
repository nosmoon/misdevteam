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


public class MT_SUBMATROUT_1109_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String owh_dt;
	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String head_remk;
	public String sub_seq;
	public String matr_cd;
	public String yesday_cnt;
	public String hjg_cnt;
	public String hjg_amt;
	public String owh_budg_cd;
	public String owh_unit;
	public String owh_qunt;
	public String owh_uprc;
	public String owh_amt;
	public String owh_dept;
	public String medi_cd;
	public String medi_ser_no;
	public String ewh_budg_cd;
	public String curdd_ewh_qunt;
	public String prv_cnt;
	public String plan_dt;
	public String remk;
	public String pers_ipaddr;
	public String pers_id;
	public String gubun;
	public String worktype;

	public MT_SUBMATROUT_1109_ADM(){}
	public MT_SUBMATROUT_1109_ADM(String cmpy_cd, String owh_dt, String occr_dt, String seq, String fac_clsf, String head_remk, String sub_seq, String matr_cd, String yesday_cnt, String hjg_cnt, String hjg_amt, String owh_budg_cd, String owh_unit, String owh_qunt, String owh_uprc, String owh_amt, String owh_dept, String medi_cd, String medi_ser_no, String ewh_budg_cd, String curdd_ewh_qunt, String prv_cnt, String plan_dt, String remk, String pers_ipaddr, String pers_id, String gubun, String worktype){
		this.cmpy_cd = cmpy_cd;
		this.owh_dt = owh_dt;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.fac_clsf = fac_clsf;
		this.head_remk = head_remk;
		this.sub_seq = sub_seq;
		this.matr_cd = matr_cd;
		this.yesday_cnt = yesday_cnt;
		this.hjg_cnt = hjg_cnt;
		this.hjg_amt = hjg_amt;
		this.owh_budg_cd = owh_budg_cd;
		this.owh_unit = owh_unit;
		this.owh_qunt = owh_qunt;
		this.owh_uprc = owh_uprc;
		this.owh_amt = owh_amt;
		this.owh_dept = owh_dept;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.ewh_budg_cd = ewh_budg_cd;
		this.curdd_ewh_qunt = curdd_ewh_qunt;
		this.prv_cnt = prv_cnt;
		this.plan_dt = plan_dt;
		this.remk = remk;
		this.pers_ipaddr = pers_ipaddr;
		this.pers_id = pers_id;
		this.gubun = gubun;
		this.worktype = worktype;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setHead_remk(String head_remk){
		this.head_remk = head_remk;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setYesday_cnt(String yesday_cnt){
		this.yesday_cnt = yesday_cnt;
	}

	public void setHjg_cnt(String hjg_cnt){
		this.hjg_cnt = hjg_cnt;
	}

	public void setHjg_amt(String hjg_amt){
		this.hjg_amt = hjg_amt;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setOwh_unit(String owh_unit){
		this.owh_unit = owh_unit;
	}

	public void setOwh_qunt(String owh_qunt){
		this.owh_qunt = owh_qunt;
	}

	public void setOwh_uprc(String owh_uprc){
		this.owh_uprc = owh_uprc;
	}

	public void setOwh_amt(String owh_amt){
		this.owh_amt = owh_amt;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setCurdd_ewh_qunt(String curdd_ewh_qunt){
		this.curdd_ewh_qunt = curdd_ewh_qunt;
	}

	public void setPrv_cnt(String prv_cnt){
		this.prv_cnt = prv_cnt;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPers_ipaddr(String pers_ipaddr){
		this.pers_ipaddr = pers_ipaddr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setWorktype(String worktype){
		this.worktype = worktype;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getHead_remk(){
		return this.head_remk;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getYesday_cnt(){
		return this.yesday_cnt;
	}

	public String getHjg_cnt(){
		return this.hjg_cnt;
	}

	public String getHjg_amt(){
		return this.hjg_amt;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getOwh_unit(){
		return this.owh_unit;
	}

	public String getOwh_qunt(){
		return this.owh_qunt;
	}

	public String getOwh_uprc(){
		return this.owh_uprc;
	}

	public String getOwh_amt(){
		return this.owh_amt;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getCurdd_ewh_qunt(){
		return this.curdd_ewh_qunt;
	}

	public String getPrv_cnt(){
		return this.prv_cnt;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPers_ipaddr(){
		return this.pers_ipaddr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getWorktype(){
		return this.worktype;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1109_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1109_ADM dm = (MT_SUBMATROUT_1109_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.owh_dt);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.head_remk);
		cstmt.setString(9, dm.sub_seq);
		cstmt.setString(10, dm.matr_cd);
		cstmt.setString(11, dm.yesday_cnt);
		cstmt.setString(12, dm.hjg_cnt);
		cstmt.setString(13, dm.hjg_amt);
		cstmt.setString(14, dm.owh_budg_cd);
		cstmt.setString(15, dm.owh_unit);
		cstmt.setString(16, dm.owh_qunt);
		cstmt.setString(17, dm.owh_uprc);
		cstmt.setString(18, dm.owh_amt);
		cstmt.setString(19, dm.owh_dept);
		cstmt.setString(20, dm.medi_cd);
		cstmt.setString(21, dm.medi_ser_no);
		cstmt.setString(22, dm.ewh_budg_cd);
		cstmt.setString(23, dm.curdd_ewh_qunt);
		cstmt.setString(24, dm.prv_cnt);
		cstmt.setString(25, dm.plan_dt);
		cstmt.setString(26, dm.remk);
		cstmt.setString(27, dm.pers_ipaddr);
		cstmt.setString(28, dm.pers_id);
		cstmt.setString(29, dm.gubun);
		cstmt.setString(30, dm.worktype);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1109_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("owh_dt = [" + getOwh_dt() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("head_remk = [" + getHead_remk() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("yesday_cnt = [" + getYesday_cnt() + "]");
		System.out.println("hjg_cnt = [" + getHjg_cnt() + "]");
		System.out.println("hjg_amt = [" + getHjg_amt() + "]");
		System.out.println("owh_budg_cd = [" + getOwh_budg_cd() + "]");
		System.out.println("owh_unit = [" + getOwh_unit() + "]");
		System.out.println("owh_qunt = [" + getOwh_qunt() + "]");
		System.out.println("owh_uprc = [" + getOwh_uprc() + "]");
		System.out.println("owh_amt = [" + getOwh_amt() + "]");
		System.out.println("owh_dept = [" + getOwh_dept() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("medi_ser_no = [" + getMedi_ser_no() + "]");
		System.out.println("ewh_budg_cd = [" + getEwh_budg_cd() + "]");
		System.out.println("curdd_ewh_qunt = [" + getCurdd_ewh_qunt() + "]");
		System.out.println("prv_cnt = [" + getPrv_cnt() + "]");
		System.out.println("plan_dt = [" + getPlan_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("pers_ipaddr = [" + getPers_ipaddr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("worktype = [" + getWorktype() + "]");
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
String owh_dt = req.getParameter("owh_dt");
if( owh_dt == null){
	System.out.println(this.toString+" : owh_dt is null" );
}else{
	System.out.println(this.toString+" : owh_dt is "+owh_dt );
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String head_remk = req.getParameter("head_remk");
if( head_remk == null){
	System.out.println(this.toString+" : head_remk is null" );
}else{
	System.out.println(this.toString+" : head_remk is "+head_remk );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String yesday_cnt = req.getParameter("yesday_cnt");
if( yesday_cnt == null){
	System.out.println(this.toString+" : yesday_cnt is null" );
}else{
	System.out.println(this.toString+" : yesday_cnt is "+yesday_cnt );
}
String hjg_cnt = req.getParameter("hjg_cnt");
if( hjg_cnt == null){
	System.out.println(this.toString+" : hjg_cnt is null" );
}else{
	System.out.println(this.toString+" : hjg_cnt is "+hjg_cnt );
}
String hjg_amt = req.getParameter("hjg_amt");
if( hjg_amt == null){
	System.out.println(this.toString+" : hjg_amt is null" );
}else{
	System.out.println(this.toString+" : hjg_amt is "+hjg_amt );
}
String owh_budg_cd = req.getParameter("owh_budg_cd");
if( owh_budg_cd == null){
	System.out.println(this.toString+" : owh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : owh_budg_cd is "+owh_budg_cd );
}
String owh_unit = req.getParameter("owh_unit");
if( owh_unit == null){
	System.out.println(this.toString+" : owh_unit is null" );
}else{
	System.out.println(this.toString+" : owh_unit is "+owh_unit );
}
String owh_qunt = req.getParameter("owh_qunt");
if( owh_qunt == null){
	System.out.println(this.toString+" : owh_qunt is null" );
}else{
	System.out.println(this.toString+" : owh_qunt is "+owh_qunt );
}
String owh_uprc = req.getParameter("owh_uprc");
if( owh_uprc == null){
	System.out.println(this.toString+" : owh_uprc is null" );
}else{
	System.out.println(this.toString+" : owh_uprc is "+owh_uprc );
}
String owh_amt = req.getParameter("owh_amt");
if( owh_amt == null){
	System.out.println(this.toString+" : owh_amt is null" );
}else{
	System.out.println(this.toString+" : owh_amt is "+owh_amt );
}
String owh_dept = req.getParameter("owh_dept");
if( owh_dept == null){
	System.out.println(this.toString+" : owh_dept is null" );
}else{
	System.out.println(this.toString+" : owh_dept is "+owh_dept );
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
String ewh_budg_cd = req.getParameter("ewh_budg_cd");
if( ewh_budg_cd == null){
	System.out.println(this.toString+" : ewh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : ewh_budg_cd is "+ewh_budg_cd );
}
String curdd_ewh_qunt = req.getParameter("curdd_ewh_qunt");
if( curdd_ewh_qunt == null){
	System.out.println(this.toString+" : curdd_ewh_qunt is null" );
}else{
	System.out.println(this.toString+" : curdd_ewh_qunt is "+curdd_ewh_qunt );
}
String prv_cnt = req.getParameter("prv_cnt");
if( prv_cnt == null){
	System.out.println(this.toString+" : prv_cnt is null" );
}else{
	System.out.println(this.toString+" : prv_cnt is "+prv_cnt );
}
String plan_dt = req.getParameter("plan_dt");
if( plan_dt == null){
	System.out.println(this.toString+" : plan_dt is null" );
}else{
	System.out.println(this.toString+" : plan_dt is "+plan_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String worktype = req.getParameter("worktype");
if( worktype == null){
	System.out.println(this.toString+" : worktype is null" );
}else{
	System.out.println(this.toString+" : worktype is "+worktype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String owh_dt = Util.checkString(req.getParameter("owh_dt"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String head_remk = Util.checkString(req.getParameter("head_remk"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String yesday_cnt = Util.checkString(req.getParameter("yesday_cnt"));
String hjg_cnt = Util.checkString(req.getParameter("hjg_cnt"));
String hjg_amt = Util.checkString(req.getParameter("hjg_amt"));
String owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
String owh_unit = Util.checkString(req.getParameter("owh_unit"));
String owh_qunt = Util.checkString(req.getParameter("owh_qunt"));
String owh_uprc = Util.checkString(req.getParameter("owh_uprc"));
String owh_amt = Util.checkString(req.getParameter("owh_amt"));
String owh_dept = Util.checkString(req.getParameter("owh_dept"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
String curdd_ewh_qunt = Util.checkString(req.getParameter("curdd_ewh_qunt"));
String prv_cnt = Util.checkString(req.getParameter("prv_cnt"));
String plan_dt = Util.checkString(req.getParameter("plan_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String pers_ipaddr = Util.checkString(req.getParameter("pers_ipaddr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
String gubun = Util.checkString(req.getParameter("gubun"));
String worktype = Util.checkString(req.getParameter("worktype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String owh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String head_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("head_remk")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String yesday_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("yesday_cnt")));
String hjg_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hjg_cnt")));
String hjg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hjg_amt")));
String owh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_budg_cd")));
String owh_unit = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_unit")));
String owh_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_qunt")));
String owh_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_uprc")));
String owh_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_amt")));
String owh_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dept")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String ewh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_budg_cd")));
String curdd_ewh_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("curdd_ewh_qunt")));
String prv_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("prv_cnt")));
String plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipaddr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String worktype = Util.Uni2Ksc(Util.checkString(req.getParameter("worktype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOwh_dt(owh_dt);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFac_clsf(fac_clsf);
dm.setHead_remk(head_remk);
dm.setSub_seq(sub_seq);
dm.setMatr_cd(matr_cd);
dm.setYesday_cnt(yesday_cnt);
dm.setHjg_cnt(hjg_cnt);
dm.setHjg_amt(hjg_amt);
dm.setOwh_budg_cd(owh_budg_cd);
dm.setOwh_unit(owh_unit);
dm.setOwh_qunt(owh_qunt);
dm.setOwh_uprc(owh_uprc);
dm.setOwh_amt(owh_amt);
dm.setOwh_dept(owh_dept);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setEwh_budg_cd(ewh_budg_cd);
dm.setCurdd_ewh_qunt(curdd_ewh_qunt);
dm.setPrv_cnt(prv_cnt);
dm.setPlan_dt(plan_dt);
dm.setRemk(remk);
dm.setPers_ipaddr(pers_ipaddr);
dm.setPers_id(pers_id);
dm.setGubun(gubun);
dm.setWorktype(worktype);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 06 13:39:54 KST 2009 */