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


public class TN_BAS_3203_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String paymethodcode;
	public String parentpaymethodcode;
	public String depth;
	public String mode;
	public String incmg_pers;

	public TN_BAS_3203_ADM(){}
	public TN_BAS_3203_ADM(String cmpy_cd, String paymethodcode, String parentpaymethodcode, String depth, String mode, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.paymethodcode = paymethodcode;
		this.parentpaymethodcode = parentpaymethodcode;
		this.depth = depth;
		this.mode = mode;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPaymethodcode(String paymethodcode){
		this.paymethodcode = paymethodcode;
	}

	public void setParentpaymethodcode(String parentpaymethodcode){
		this.parentpaymethodcode = parentpaymethodcode;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPaymethodcode(){
		return this.paymethodcode;
	}

	public String getParentpaymethodcode(){
		return this.parentpaymethodcode;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getMode(){
		return this.mode;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_3203_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_3203_ADM dm = (TN_BAS_3203_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.paymethodcode);
		cstmt.setString(5, dm.parentpaymethodcode);
		cstmt.setString(6, dm.depth);
		cstmt.setString(7, dm.mode);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_3203_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("paymethodcode = [" + getPaymethodcode() + "]");
		System.out.println("parentpaymethodcode = [" + getParentpaymethodcode() + "]");
		System.out.println("depth = [" + getDepth() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String paymethodcode = req.getParameter("paymethodcode");
if( paymethodcode == null){
	System.out.println(this.toString+" : paymethodcode is null" );
}else{
	System.out.println(this.toString+" : paymethodcode is "+paymethodcode );
}
String parentpaymethodcode = req.getParameter("parentpaymethodcode");
if( parentpaymethodcode == null){
	System.out.println(this.toString+" : parentpaymethodcode is null" );
}else{
	System.out.println(this.toString+" : parentpaymethodcode is "+parentpaymethodcode );
}
String depth = req.getParameter("depth");
if( depth == null){
	System.out.println(this.toString+" : depth is null" );
}else{
	System.out.println(this.toString+" : depth is "+depth );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paymethodcode = Util.checkString(req.getParameter("paymethodcode"));
String parentpaymethodcode = Util.checkString(req.getParameter("parentpaymethodcode"));
String depth = Util.checkString(req.getParameter("depth"));
String mode = Util.checkString(req.getParameter("mode"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paymethodcode = Util.Uni2Ksc(Util.checkString(req.getParameter("paymethodcode")));
String parentpaymethodcode = Util.Uni2Ksc(Util.checkString(req.getParameter("parentpaymethodcode")));
String depth = Util.Uni2Ksc(Util.checkString(req.getParameter("depth")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPaymethodcode(paymethodcode);
dm.setParentpaymethodcode(parentpaymethodcode);
dm.setDepth(depth);
dm.setMode(mode);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 05 18:24:59 KST 2016 */