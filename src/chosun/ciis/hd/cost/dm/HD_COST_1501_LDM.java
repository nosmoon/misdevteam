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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String card_type;
	public String decid_yymm;
	public String dept_cd;
	public String actu_slip_no;

	public HD_COST_1501_LDM(){}
	public HD_COST_1501_LDM(String cmpy_cd, String card_type, String decid_yymm, String dept_cd, String actu_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.card_type = card_type;
		this.decid_yymm = decid_yymm;
		this.dept_cd = dept_cd;
		this.actu_slip_no = actu_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_type(String card_type){
		this.card_type = card_type;
	}

	public void setDecid_yymm(String decid_yymm){
		this.decid_yymm = decid_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCard_type(){
		return this.card_type;
	}

	public String getDecid_yymm(){
		return this.decid_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_1501_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_1501_LDM dm = (HD_COST_1501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.card_type);
		cstmt.setString(5, dm.decid_yymm);
		cstmt.setString(6, dm.dept_cd);
		cstmt.setString(7, dm.actu_slip_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_1501_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("card_type = [" + getCard_type() + "]");
		System.out.println("decid_yymm = [" + getDecid_yymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
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
String card_type = req.getParameter("card_type");
if( card_type == null){
	System.out.println(this.toString+" : card_type is null" );
}else{
	System.out.println(this.toString+" : card_type is "+card_type );
}
String decid_yymm = req.getParameter("decid_yymm");
if( decid_yymm == null){
	System.out.println(this.toString+" : decid_yymm is null" );
}else{
	System.out.println(this.toString+" : decid_yymm is "+decid_yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String card_type = Util.checkString(req.getParameter("card_type"));
String decid_yymm = Util.checkString(req.getParameter("decid_yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String card_type = Util.Uni2Ksc(Util.checkString(req.getParameter("card_type")));
String decid_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCard_type(card_type);
dm.setDecid_yymm(decid_yymm);
dm.setDept_cd(dept_cd);
dm.setActu_slip_no(actu_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 14:18:29 KST 2009 */