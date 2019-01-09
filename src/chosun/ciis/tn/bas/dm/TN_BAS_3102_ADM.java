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


public class TN_BAS_3102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String supportidx;
	public String parent_supportcode;
	public String depth;
	public String support;
	public String supportcode;
	public String memo;
	public String displayorder;
	public String useinsert;

	public TN_BAS_3102_ADM(){}
	public TN_BAS_3102_ADM(String cmpy_cd, String incmg_pers, String supportidx, String parent_supportcode, String depth, String support, String supportcode, String memo, String displayorder, String useinsert){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.supportidx = supportidx;
		this.parent_supportcode = parent_supportcode;
		this.depth = depth;
		this.support = support;
		this.supportcode = supportcode;
		this.memo = memo;
		this.displayorder = displayorder;
		this.useinsert = useinsert;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public void setParent_supportcode(String parent_supportcode){
		this.parent_supportcode = parent_supportcode;
	}

	public void setDepth(String depth){
		this.depth = depth;
	}

	public void setSupport(String support){
		this.support = support;
	}

	public void setSupportcode(String supportcode){
		this.supportcode = supportcode;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setDisplayorder(String displayorder){
		this.displayorder = displayorder;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSupportidx(){
		return this.supportidx;
	}

	public String getParent_supportcode(){
		return this.parent_supportcode;
	}

	public String getDepth(){
		return this.depth;
	}

	public String getSupport(){
		return this.support;
	}

	public String getSupportcode(){
		return this.supportcode;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getDisplayorder(){
		return this.displayorder;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_3102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_3102_ADM dm = (TN_BAS_3102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.supportidx);
		cstmt.setString(6, dm.parent_supportcode);
		cstmt.setString(7, dm.depth);
		cstmt.setString(8, dm.support);
		cstmt.setString(9, dm.supportcode);
		cstmt.setString(10, dm.memo);
		cstmt.setString(11, dm.displayorder);
		cstmt.setString(12, dm.useinsert);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_3102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("supportidx = [" + getSupportidx() + "]");
		System.out.println("parent_supportcode = [" + getParent_supportcode() + "]");
		System.out.println("depth = [" + getDepth() + "]");
		System.out.println("support = [" + getSupport() + "]");
		System.out.println("supportcode = [" + getSupportcode() + "]");
		System.out.println("memo = [" + getMemo() + "]");
		System.out.println("displayorder = [" + getDisplayorder() + "]");
		System.out.println("useinsert = [" + getUseinsert() + "]");
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
String supportidx = req.getParameter("supportidx");
if( supportidx == null){
	System.out.println(this.toString+" : supportidx is null" );
}else{
	System.out.println(this.toString+" : supportidx is "+supportidx );
}
String parent_supportcode = req.getParameter("parent_supportcode");
if( parent_supportcode == null){
	System.out.println(this.toString+" : parent_supportcode is null" );
}else{
	System.out.println(this.toString+" : parent_supportcode is "+parent_supportcode );
}
String depth = req.getParameter("depth");
if( depth == null){
	System.out.println(this.toString+" : depth is null" );
}else{
	System.out.println(this.toString+" : depth is "+depth );
}
String support = req.getParameter("support");
if( support == null){
	System.out.println(this.toString+" : support is null" );
}else{
	System.out.println(this.toString+" : support is "+support );
}
String supportcode = req.getParameter("supportcode");
if( supportcode == null){
	System.out.println(this.toString+" : supportcode is null" );
}else{
	System.out.println(this.toString+" : supportcode is "+supportcode );
}
String memo = req.getParameter("memo");
if( memo == null){
	System.out.println(this.toString+" : memo is null" );
}else{
	System.out.println(this.toString+" : memo is "+memo );
}
String displayorder = req.getParameter("displayorder");
if( displayorder == null){
	System.out.println(this.toString+" : displayorder is null" );
}else{
	System.out.println(this.toString+" : displayorder is "+displayorder );
}
String useinsert = req.getParameter("useinsert");
if( useinsert == null){
	System.out.println(this.toString+" : useinsert is null" );
}else{
	System.out.println(this.toString+" : useinsert is "+useinsert );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String supportidx = Util.checkString(req.getParameter("supportidx"));
String parent_supportcode = Util.checkString(req.getParameter("parent_supportcode"));
String depth = Util.checkString(req.getParameter("depth"));
String support = Util.checkString(req.getParameter("support"));
String supportcode = Util.checkString(req.getParameter("supportcode"));
String memo = Util.checkString(req.getParameter("memo"));
String displayorder = Util.checkString(req.getParameter("displayorder"));
String useinsert = Util.checkString(req.getParameter("useinsert"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String supportidx = Util.Uni2Ksc(Util.checkString(req.getParameter("supportidx")));
String parent_supportcode = Util.Uni2Ksc(Util.checkString(req.getParameter("parent_supportcode")));
String depth = Util.Uni2Ksc(Util.checkString(req.getParameter("depth")));
String support = Util.Uni2Ksc(Util.checkString(req.getParameter("support")));
String supportcode = Util.Uni2Ksc(Util.checkString(req.getParameter("supportcode")));
String memo = Util.Uni2Ksc(Util.checkString(req.getParameter("memo")));
String displayorder = Util.Uni2Ksc(Util.checkString(req.getParameter("displayorder")));
String useinsert = Util.Uni2Ksc(Util.checkString(req.getParameter("useinsert")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setSupportidx(supportidx);
dm.setParent_supportcode(parent_supportcode);
dm.setDepth(depth);
dm.setSupport(support);
dm.setSupportcode(supportcode);
dm.setMemo(memo);
dm.setDisplayorder(displayorder);
dm.setUseinsert(useinsert);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 05 11:16:32 KST 2016 */