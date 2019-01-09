/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bo_nm;
	public String bo_head_nm;
	public String cntr_stat_clsf;
	public String dept_cd;
	public String bo_cd;

	public SE_COMM_1110_LDM(){}
	public SE_COMM_1110_LDM(String cmpy_cd, String bo_nm, String bo_head_nm, String cntr_stat_clsf, String dept_cd, String bo_cd){
		this.cmpy_cd = cmpy_cd;
		this.bo_nm = bo_nm;
		this.bo_head_nm = bo_head_nm;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.dept_cd = dept_cd;
		this.bo_cd = bo_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_COMM_1110_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_1110_LDM dm = (SE_COMM_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bo_nm);
		cstmt.setString(5, dm.bo_head_nm);
		cstmt.setString(6, dm.cntr_stat_clsf);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.bo_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_1110_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bo_nm = " + getBo_nm());
        System.out.println("bo_head_nm = " + getBo_head_nm());
        System.out.println("cntr_stat_clsf = " + getCntr_stat_clsf());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("bo_cd = " + getBo_cd());
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
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String bo_head_nm = req.getParameter("bo_head_nm");
if( bo_head_nm == null){
	System.out.println(this.toString+" : bo_head_nm is null" );
}else{
	System.out.println(this.toString+" : bo_head_nm is "+bo_head_nm );
}
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String bo_head_nm = Util.checkString(req.getParameter("bo_head_nm"));
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String bo_head_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_head_nm")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBo_nm(bo_nm);
dm.setBo_head_nm(bo_head_nm);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setDept_cd(dept_cd);
dm.setBo_cd(bo_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 11:27:13 KST 2009 */