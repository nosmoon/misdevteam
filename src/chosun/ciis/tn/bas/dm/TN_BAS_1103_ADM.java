/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String mode;
	public String organidx;
	public String deptidx;

	public TN_BAS_1103_ADM(){}
	public TN_BAS_1103_ADM(String cmpy_cd, String incmg_pers, String mode, String organidx, String deptidx){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.organidx = organidx;
		this.deptidx = deptidx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_1103_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_1103_ADM dm = (TN_BAS_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.organidx);
		cstmt.setString(7, dm.deptidx);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_1103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("organidx = [" + getOrganidx() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String organidx = req.getParameter("organidx");
if( organidx == null){
	System.out.println(this.toString+" : organidx is null" );
}else{
	System.out.println(this.toString+" : organidx is "+organidx );
}
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String organidx = Util.checkString(req.getParameter("organidx"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String organidx = Util.Uni2Ksc(Util.checkString(req.getParameter("organidx")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setOrganidx(organidx);
dm.setDeptidx(deptidx);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 22 18:08:40 KST 2016 */