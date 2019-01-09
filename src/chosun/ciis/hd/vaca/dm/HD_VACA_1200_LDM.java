/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 *
 */

public class HD_VACA_1200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String aply_yy;
	public String qq_clsf;

	public HD_VACA_1200_LDM(){}
	public HD_VACA_1200_LDM(String cmpy_cd, String emp_no, String aply_yy, String qq_clsf){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.aply_yy = aply_yy;
		this.qq_clsf = qq_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setQq_clsf(String qq_clsf){
		this.qq_clsf = qq_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getQq_clsf(){
		return this.qq_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1200_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1200_LDM dm = (HD_VACA_1200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.aply_yy);
		cstmt.setString(6, dm.qq_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.vaca.ds.HD_VACA_1200_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("aply_yy = " + getAply_yy());
        System.out.println("qq_clsf = " + getQq_clsf());
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String aply_yy = req.getParameter("aply_yy");
if( aply_yy == null){
	System.out.println(this.toString+" : aply_yy is null" );
}else{
	System.out.println(this.toString+" : aply_yy is "+aply_yy );
}
String qq_clsf = req.getParameter("qq_clsf");
if( qq_clsf == null){
	System.out.println(this.toString+" : qq_clsf is null" );
}else{
	System.out.println(this.toString+" : qq_clsf is "+qq_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String aply_yy = Util.checkString(req.getParameter("aply_yy"));
String qq_clsf = Util.checkString(req.getParameter("qq_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String aply_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_yy")));
String qq_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("qq_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAply_yy(aply_yy);
dm.setQq_clsf(qq_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 13:02:22 KST 2009 */