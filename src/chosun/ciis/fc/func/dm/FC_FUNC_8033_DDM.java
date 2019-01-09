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


public class FC_FUNC_8033_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String grid1_mode;
	public String grid1_rownum;
	public String grid1_pay_cost_clsf;
	public String grid1_hsty_seq;

	public FC_FUNC_8033_DDM(){}
	public FC_FUNC_8033_DDM(String cmpy_cd, String cntr_clsf_cd, String leas_clsf_cd, String leas_no, String grid1_mode, String grid1_rownum, String grid1_pay_cost_clsf, String grid1_hsty_seq){
		this.cmpy_cd = cmpy_cd;
		this.cntr_clsf_cd = cntr_clsf_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.grid1_mode = grid1_mode;
		this.grid1_rownum = grid1_rownum;
		this.grid1_pay_cost_clsf = grid1_pay_cost_clsf;
		this.grid1_hsty_seq = grid1_hsty_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setGrid1_mode(String grid1_mode){
		this.grid1_mode = grid1_mode;
	}

	public void setGrid1_rownum(String grid1_rownum){
		this.grid1_rownum = grid1_rownum;
	}

	public void setGrid1_pay_cost_clsf(String grid1_pay_cost_clsf){
		this.grid1_pay_cost_clsf = grid1_pay_cost_clsf;
	}

	public void setGrid1_hsty_seq(String grid1_hsty_seq){
		this.grid1_hsty_seq = grid1_hsty_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getGrid1_mode(){
		return this.grid1_mode;
	}

	public String getGrid1_rownum(){
		return this.grid1_rownum;
	}

	public String getGrid1_pay_cost_clsf(){
		return this.grid1_pay_cost_clsf;
	}

	public String getGrid1_hsty_seq(){
		return this.grid1_hsty_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8033_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8033_DDM dm = (FC_FUNC_8033_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cntr_clsf_cd);
		cstmt.setString(5, dm.leas_clsf_cd);
		cstmt.setString(6, dm.leas_no);
		cstmt.setString(7, dm.grid1_mode);
		cstmt.setString(8, dm.grid1_rownum);
		cstmt.setString(9, dm.grid1_pay_cost_clsf);
		cstmt.setString(10, dm.grid1_hsty_seq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8033_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cntr_clsf_cd = [" + getCntr_clsf_cd() + "]");
		System.out.println("leas_clsf_cd = [" + getLeas_clsf_cd() + "]");
		System.out.println("leas_no = [" + getLeas_no() + "]");
		System.out.println("grid1_mode = [" + getGrid1_mode() + "]");
		System.out.println("grid1_rownum = [" + getGrid1_rownum() + "]");
		System.out.println("grid1_pay_cost_clsf = [" + getGrid1_pay_cost_clsf() + "]");
		System.out.println("grid1_hsty_seq = [" + getGrid1_hsty_seq() + "]");
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
String grid1_pay_cost_clsf = req.getParameter("grid1_pay_cost_clsf");
if( grid1_pay_cost_clsf == null){
	System.out.println(this.toString+" : grid1_pay_cost_clsf is null" );
}else{
	System.out.println(this.toString+" : grid1_pay_cost_clsf is "+grid1_pay_cost_clsf );
}
String grid1_hsty_seq = req.getParameter("grid1_hsty_seq");
if( grid1_hsty_seq == null){
	System.out.println(this.toString+" : grid1_hsty_seq is null" );
}else{
	System.out.println(this.toString+" : grid1_hsty_seq is "+grid1_hsty_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cntr_clsf_cd = Util.checkString(req.getParameter("cntr_clsf_cd"));
String leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String grid1_mode = Util.checkString(req.getParameter("grid1_mode"));
String grid1_rownum = Util.checkString(req.getParameter("grid1_rownum"));
String grid1_pay_cost_clsf = Util.checkString(req.getParameter("grid1_pay_cost_clsf"));
String grid1_hsty_seq = Util.checkString(req.getParameter("grid1_hsty_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cntr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_clsf_cd")));
String leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String grid1_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_mode")));
String grid1_rownum = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_rownum")));
String grid1_pay_cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_pay_cost_clsf")));
String grid1_hsty_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("grid1_hsty_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCntr_clsf_cd(cntr_clsf_cd);
dm.setLeas_clsf_cd(leas_clsf_cd);
dm.setLeas_no(leas_no);
dm.setGrid1_mode(grid1_mode);
dm.setGrid1_rownum(grid1_rownum);
dm.setGrid1_pay_cost_clsf(grid1_pay_cost_clsf);
dm.setGrid1_hsty_seq(grid1_hsty_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 08:53:52 KST 2009 */