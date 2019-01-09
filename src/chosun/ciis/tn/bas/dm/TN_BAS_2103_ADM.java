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


public class TN_BAS_2103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String mode;
	public String relationidx;
	public String mode_2;
	public String relationidx_2;
	public String mode_3;
	public String relationidx_3;

	public TN_BAS_2103_ADM(){}
	public TN_BAS_2103_ADM(String cmpy_cd, String incmg_pers, String mode, String relationidx, String mode_2, String relationidx_2, String mode_3, String relationidx_3){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.relationidx = relationidx;
		this.mode_2 = mode_2;
		this.relationidx_2 = relationidx_2;
		this.mode_3 = mode_3;
		this.relationidx_3 = relationidx_3;
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

	public void setRelationidx(String relationidx){
		this.relationidx = relationidx;
	}

	public void setMode_2(String mode_2){
		this.mode_2 = mode_2;
	}

	public void setRelationidx_2(String relationidx_2){
		this.relationidx_2 = relationidx_2;
	}

	public void setMode_3(String mode_3){
		this.mode_3 = mode_3;
	}

	public void setRelationidx_3(String relationidx_3){
		this.relationidx_3 = relationidx_3;
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

	public String getRelationidx(){
		return this.relationidx;
	}

	public String getMode_2(){
		return this.mode_2;
	}

	public String getRelationidx_2(){
		return this.relationidx_2;
	}

	public String getMode_3(){
		return this.mode_3;
	}

	public String getRelationidx_3(){
		return this.relationidx_3;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_2103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_2103_ADM dm = (TN_BAS_2103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.relationidx);
		cstmt.setString(7, dm.mode_2);
		cstmt.setString(8, dm.relationidx_2);
		cstmt.setString(9, dm.mode_3);
		cstmt.setString(10, dm.relationidx_3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_2103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("relationidx = [" + getRelationidx() + "]");
		System.out.println("mode_2 = [" + getMode_2() + "]");
		System.out.println("relationidx_2 = [" + getRelationidx_2() + "]");
		System.out.println("mode_3 = [" + getMode_3() + "]");
		System.out.println("relationidx_3 = [" + getRelationidx_3() + "]");
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
String relationidx = req.getParameter("relationidx");
if( relationidx == null){
	System.out.println(this.toString+" : relationidx is null" );
}else{
	System.out.println(this.toString+" : relationidx is "+relationidx );
}
String mode_2 = req.getParameter("mode_2");
if( mode_2 == null){
	System.out.println(this.toString+" : mode_2 is null" );
}else{
	System.out.println(this.toString+" : mode_2 is "+mode_2 );
}
String relationidx_2 = req.getParameter("relationidx_2");
if( relationidx_2 == null){
	System.out.println(this.toString+" : relationidx_2 is null" );
}else{
	System.out.println(this.toString+" : relationidx_2 is "+relationidx_2 );
}
String mode_3 = req.getParameter("mode_3");
if( mode_3 == null){
	System.out.println(this.toString+" : mode_3 is null" );
}else{
	System.out.println(this.toString+" : mode_3 is "+mode_3 );
}
String relationidx_3 = req.getParameter("relationidx_3");
if( relationidx_3 == null){
	System.out.println(this.toString+" : relationidx_3 is null" );
}else{
	System.out.println(this.toString+" : relationidx_3 is "+relationidx_3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String relationidx = Util.checkString(req.getParameter("relationidx"));
String mode_2 = Util.checkString(req.getParameter("mode_2"));
String relationidx_2 = Util.checkString(req.getParameter("relationidx_2"));
String mode_3 = Util.checkString(req.getParameter("mode_3"));
String relationidx_3 = Util.checkString(req.getParameter("relationidx_3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String relationidx = Util.Uni2Ksc(Util.checkString(req.getParameter("relationidx")));
String mode_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_2")));
String relationidx_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("relationidx_2")));
String mode_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_3")));
String relationidx_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("relationidx_3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setRelationidx(relationidx);
dm.setMode_2(mode_2);
dm.setRelationidx_2(relationidx_2);
dm.setMode_3(mode_3);
dm.setRelationidx_3(relationidx_3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 20 15:59:45 KST 2016 */