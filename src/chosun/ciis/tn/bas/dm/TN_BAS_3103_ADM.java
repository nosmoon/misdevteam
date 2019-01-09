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


public class TN_BAS_3103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String supportidx;
	public String supportcode;
	public String mode;

	public TN_BAS_3103_ADM(){}
	public TN_BAS_3103_ADM(String cmpy_cd, String supportidx, String supportcode, String mode){
		this.cmpy_cd = cmpy_cd;
		this.supportidx = supportidx;
		this.supportcode = supportcode;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setSupportcode(String supportcode){
		this.supportcode = supportcode;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getSupportcode(){
		return this.supportcode;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_3103_A(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_3103_ADM dm = (TN_BAS_3103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.supportidx);
		cstmt.setString(5, dm.supportcode);
		cstmt.setString(6, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_3103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("supportidx = [" + getSupportidx() + "]");
		System.out.println("supportcode = [" + getSupportcode() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String supportidx = req.getParameter("supportidx");
if( supportidx == null){
	System.out.println(this.toString+" : supportidx is null" );
}else{
	System.out.println(this.toString+" : supportidx is "+supportidx );
}
String supportcode = req.getParameter("supportcode");
if( supportcode == null){
	System.out.println(this.toString+" : supportcode is null" );
}else{
	System.out.println(this.toString+" : supportcode is "+supportcode );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String supportidx = Util.checkString(req.getParameter("supportidx"));
String supportcode = Util.checkString(req.getParameter("supportcode"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String supportidx = Util.Uni2Ksc(Util.checkString(req.getParameter("supportidx")));
String supportcode = Util.Uni2Ksc(Util.checkString(req.getParameter("supportcode")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSupportidx(supportidx);
dm.setSupportcode(supportcode);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 05 11:18:05 KST 2016 */