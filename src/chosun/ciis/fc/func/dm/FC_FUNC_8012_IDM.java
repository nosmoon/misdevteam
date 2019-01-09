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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8012_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String pers;
	public String pers_ipadd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String leas_sub_seq;
	public String totz_dt;
	public String cost_amt;
	public String grid1_mode;
	public String grid1_rownum;
	public String grid1_slip_no;
	public String grid1_cost_amt;
	public String grid1_rmks;
	public String grid1_fisc_dt;

	public FC_FUNC_8012_IDM(){}
	public FC_FUNC_8012_IDM(String cmpy_cd, String uid, String pers, String pers_ipadd, String cntr_clsf_cd, String leas_clsf_cd, String leas_no, String leas_sub_seq, String totz_dt, String cost_amt, String grid1_mode, String grid1_rownum, String grid1_slip_no, String grid1_cost_amt, String grid1_rmks, String grid1_fisc_dt){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.pers = pers;
		this.pers_ipadd = pers_ipadd;
		this.cntr_clsf_cd = cntr_clsf_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.leas_sub_seq = leas_sub_seq;
		this.totz_dt = totz_dt;
		this.cost_amt = cost_amt;
		this.grid1_mode = grid1_mode;
		this.grid1_rownum = grid1_rownum;
		this.grid1_slip_no = grid1_slip_no;
		this.grid1_cost_amt = grid1_cost_amt;
		this.grid1_rmks = grid1_rmks;
		this.grid1_fisc_dt = grid1_fisc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setPers(String pers){
		this.pers = pers;
	}

	public void setPers_ipadd(String pers_ipadd){
		this.pers_ipadd = pers_ipadd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLeas_sub_seq(String leas_sub_seq){
		this.leas_sub_seq = leas_sub_seq;
	}

	public void setTotz_dt(String totz_dt){
		this.totz_dt = totz_dt;
	}

	public void setCost_amt(String cost_amt){
		this.cost_amt = cost_amt;
	}

	public void setGrid1_mode(String grid1_mode){
		this.grid1_mode = grid1_mode;
	}

	public void setGrid1_rownum(String grid1_rownum){
		this.grid1_rownum = grid1_rownum;
	}

	public void setGrid1_slip_no(String grid1_slip_no){
		this.grid1_slip_no = grid1_slip_no;
	}

	public void setGrid1_cost_amt(String grid1_cost_amt){
		this.grid1_cost_amt = grid1_cost_amt;
	}

	public void setGrid1_rmks(String grid1_rmks){
		this.grid1_rmks = grid1_rmks;
	}

	public void setGrid1_fisc_dt(String grid1_fisc_dt){
		this.grid1_fisc_dt = grid1_fisc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getPers(){
		return this.pers;
	}

	public String getPers_ipadd(){
		return this.pers_ipadd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getLeas_sub_seq(){
		return this.leas_sub_seq;
	}

	public String getTotz_dt(){
		return this.totz_dt;
	}

	public String getCost_amt(){
		return this.cost_amt;
	}

	public String getGrid1_mode(){
		return this.grid1_mode;
	}

	public String getGrid1_rownum(){
		return this.grid1_rownum;
	}

	public String getGrid1_slip_no(){
		return this.grid1_slip_no;
	}

	public String getGrid1_cost_amt(){
		return this.grid1_cost_amt;
	}

	public String getGrid1_rmks(){
		return this.grid1_rmks;
	}

	public String getGrid1_fisc_dt(){
		return this.grid1_fisc_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8012_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8012_IDM dm = (FC_FUNC_8012_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.pers);
		cstmt.setString(6, dm.pers_ipadd);
		cstmt.setString(7, dm.cntr_clsf_cd);
		cstmt.setString(8, dm.leas_clsf_cd);
		cstmt.setString(9, dm.leas_no);
		cstmt.setString(10, dm.leas_sub_seq);
		cstmt.setString(11, dm.totz_dt);
		cstmt.setString(12, dm.cost_amt);
		cstmt.setString(13, dm.grid1_mode);
		cstmt.setString(14, dm.grid1_rownum);
		cstmt.setString(15, dm.grid1_slip_no);
		cstmt.setString(16, dm.grid1_cost_amt);
		cstmt.setString(17, dm.grid1_rmks);
		cstmt.setString(18, dm.grid1_fisc_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8012_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("pers = [" + getPers() + "]");
		System.out.println("pers_ipadd = [" + getPers_ipadd() + "]");
		System.out.println("cntr_clsf_cd = [" + getCntr_clsf_cd() + "]");
		System.out.println("leas_clsf_cd = [" + getLeas_clsf_cd() + "]");
		System.out.println("leas_no = [" + getLeas_no() + "]");
		System.out.println("leas_sub_seq = [" + getLeas_sub_seq() + "]");
		System.out.println("totz_dt = [" + getTotz_dt() + "]");
		System.out.println("cost_amt = [" + getCost_amt() + "]");
		System.out.println("grid1_mode = [" + getGrid1_mode() + "]");
		System.out.println("grid1_rownum = [" + getGrid1_rownum() + "]");
		System.out.println("grid1_slip_no = [" + getGrid1_slip_no() + "]");
		System.out.println("grid1_cost_amt = [" + getGrid1_cost_amt() + "]");
		System.out.println("grid1_rmks = [" + getGrid1_rmks() + "]");
		System.out.println("grid1_fisc_dt = [" + getGrid1_fisc_dt() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String pers = req.getParameter("pers");
if( pers == null){
	System.out.println(this.toString+" : pers is null" );
}else{
	System.out.println(this.toString+" : pers is "+pers );
}
String pers_ipadd = req.getParameter("pers_ipadd");
if( pers_ipadd == null){
	System.out.println(this.toString+" : pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : pers_ipadd is "+pers_ipadd );
}
String cntr_clsf_cd = req.getParameter("cntr_clsf_cd");
if( cntr_clsf_cd == null){
	System.out.println(this.toString+" : cntr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : cntr_clsf_cd is "+cntr_clsf_cd );
}
String leas_clsf_cd = req.getParameter("leas_clsf_cd");
if( leas_clsf_cd == null){
	System.out.println(this.toString+" : leas_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : leas_clsf_cd is "+leas_clsf_cd );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String leas_sub_seq = req.getParameter("leas_sub_seq");
if( leas_sub_seq == null){
	System.out.println(this.toString+" : leas_sub_seq is null" );
}else{
	System.out.println(this.toString+" : leas_sub_seq is "+leas_sub_seq );
}
String totz_dt = req.getParameter("totz_dt");
if( totz_dt == null){
	System.out.println(this.toString+" : totz_dt is null" );
}else{
	System.out.println(this.toString+" : totz_dt is "+totz_dt );
}
String cost_amt = req.getParameter("cost_amt");
if( cost_amt == null){
	System.out.println(this.toString+" : cost_amt is null" );
}else{
	System.out.println(this.toString+" : cost_amt is "+cost_amt );
}
String grid1_mode = req.getParameter("grid1_mode");
if( grid1_mode == null){
	System.out.println(this.toString+" : grid1_mode is null" );
}else{
	System.out.println(this.toString+" : grid1_mode is "+grid1_mode );
}
String grid1_rownum = req.getParameter("grid1_rownum");
if( grid1_rownum == null){
	System.out.println(this.toString+" : grid1_rownum is null" );
}else{
	System.out.println(this.toString+" : grid1_rownum is "+grid1_rownum );
}
String grid1_slip_no = req.getParameter("grid1_slip_no");
if( grid1_slip_no == null){
	System.out.println(this.toString+" : grid1_slip_no is null" );
}else{
	System.out.println(this.toString+" : grid1_slip_no is "+grid1_slip_no );
}
String grid1_cost_amt = req.getParameter("grid1_cost_amt");
if( grid1_cost_amt == null){
	System.out.println(this.toString+" : grid1_cost_amt is null" );
}else{
	System.out.println(this.toString+" : grid1_cost_amt is "+grid1_cost_amt );
}
String grid1_rmks = req.getParameter("grid1_rmks");
if( grid1_rmks == null){
	System.out.println(this.toString+" : grid1_rmks is null" );
}else{
	System.out.println(this.toString+" : grid1_rmks is "+grid1_rmks );
}
String grid1_fisc_dt = req.getParameter("grid1_fisc_dt");
if( grid1_fisc_dt == null){
	System.out.println(this.toString+" : grid1_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : grid1_fisc_dt is "+grid1_fisc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String pers = Util.checkString(req.getParameter("pers"));
String pers_ipadd = Util.checkString(req.getParameter("pers_ipadd"));
String cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
String leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String leas_sub_seq = Util.checkString(req.getParameter("leas_sub_seq"));
String totz_dt = Util.checkString(req.getParameter("totz_dt"));
String cost_amt = Util.checkString(req.getParameter("cost_amt"));
String grid1_mode = Util.checkString(req.getParameter("grid1_mode"));
String grid1_rownum = Util.checkString(req.getParameter("grid1_rownum"));
String grid1_slip_no = Util.checkString(req.getParameter("grid1_slip_no"));
String grid1_cost_amt = Util.checkString(req.getParameter("grid1_cost_amt"));
String grid1_rmks = Util.checkString(req.getParameter("grid1_rmks"));
String grid1_fisc_dt = Util.checkString(req.getParameter("grid1_fisc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String pers = Util.Uni2Ksc(Util.checkString(req.getParameter("pers")));
String pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ipadd")));
String cntr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_clsf_cd")));
String leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String leas_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_sub_seq")));
String totz_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("totz_dt")));
String cost_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_amt")));
String grid1_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mode")));
String grid1_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rownum")));
String grid1_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_slip_no")));
String grid1_cost_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_cost_amt")));
String grid1_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rmks")));
String grid1_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_fisc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setPers(pers);
dm.setPers_ipadd(pers_ipadd);
dm.setCntr_clsf_cd(cntr_clsf_cd);
dm.setLeas_clsf_cd(leas_clsf_cd);
dm.setLeas_no(leas_no);
dm.setLeas_sub_seq(leas_sub_seq);
dm.setTotz_dt(totz_dt);
dm.setCost_amt(cost_amt);
dm.setGrid1_mode(grid1_mode);
dm.setGrid1_rownum(grid1_rownum);
dm.setGrid1_slip_no(grid1_slip_no);
dm.setGrid1_cost_amt(grid1_cost_amt);
dm.setGrid1_rmks(grid1_rmks);
dm.setGrid1_fisc_dt(grid1_fisc_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 12:40:10 KST 2009 */