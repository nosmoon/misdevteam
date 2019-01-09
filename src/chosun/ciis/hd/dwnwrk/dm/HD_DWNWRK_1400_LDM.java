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


package chosun.ciis.hd.dwnwrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.dwnwrk.ds.*;
import chosun.ciis.hd.dwnwrk.rec.*;

/**
 *
 */

public class HD_DWNWRK_1400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String fr_duty_dt;
	public String to_duty_dt;

	public HD_DWNWRK_1400_LDM(){}
	public HD_DWNWRK_1400_LDM(String cmpy_cd, String dept_cd, String fr_duty_dt, String to_duty_dt){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.fr_duty_dt = fr_duty_dt;
		this.to_duty_dt = to_duty_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFr_duty_dt(String fr_duty_dt){
		this.fr_duty_dt = fr_duty_dt;
	}

	public void setTo_duty_dt(String to_duty_dt){
		this.to_duty_dt = to_duty_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFr_duty_dt(){
		return this.fr_duty_dt;
	}

	public String getTo_duty_dt(){
		return this.to_duty_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DWNWRK_1400_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DWNWRK_1400_LDM dm = (HD_DWNWRK_1400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.fr_duty_dt);
		cstmt.setString(6, dm.to_duty_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.dwnwrk.ds.HD_DWNWRK_1400_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("fr_duty_dt = " + getFr_duty_dt());
        System.out.println("to_duty_dt = " + getTo_duty_dt());
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String fr_duty_dt = req.getParameter("fr_duty_dt");
if( fr_duty_dt == null){
	System.out.println(this.toString+" : fr_duty_dt is null" );
}else{
	System.out.println(this.toString+" : fr_duty_dt is "+fr_duty_dt );
}
String to_duty_dt = req.getParameter("to_duty_dt");
if( to_duty_dt == null){
	System.out.println(this.toString+" : to_duty_dt is null" );
}else{
	System.out.println(this.toString+" : to_duty_dt is "+to_duty_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String fr_duty_dt = Util.checkString(req.getParameter("fr_duty_dt"));
String to_duty_dt = Util.checkString(req.getParameter("to_duty_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String fr_duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_duty_dt")));
String to_duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_duty_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setFr_duty_dt(fr_duty_dt);
dm.setTo_duty_dt(to_duty_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 16:39:34 KST 2009 */