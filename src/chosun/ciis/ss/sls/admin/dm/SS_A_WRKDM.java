/***************************************************************************************************
* 파일명 : SS_A_WRKDM.java
* 기능 : 관리자-작업-등록-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-04-08
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-작업-등록-등록,수정,삭제를 위한 DM
 */

public class SS_A_WRKDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String id;
	public String descri;
	public String cycl;
	public String basidt;
	public String endddyn;
	public String basitm;
	public String pgmnm;
	public String remk;

	public SS_A_WRKDM(){}
	public SS_A_WRKDM(String incmgpers, String accflag, String id, String descri, String cycl, String basidt, String endddyn, String basitm, String pgmnm, String remk){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.id = id;
		this.descri = descri;
		this.cycl = cycl;
		this.basidt = basidt;
		this.endddyn = endddyn;
		this.basitm = basitm;
		this.pgmnm = pgmnm;
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setId(String id){
		this.id = id;
	}

	public void setDescri(String descri){
		this.descri = descri;
	}

	public void setCycl(String cycl){
		this.cycl = cycl;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setEndddyn(String endddyn){
		this.endddyn = endddyn;
	}

	public void setBasitm(String basitm){
		this.basitm = basitm;
	}

	public void setPgmnm(String pgmnm){
		this.pgmnm = pgmnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getId(){
		return this.id;
	}

	public String getDescri(){
		return this.descri;
	}

	public String getCycl(){
		return this.cycl;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getEndddyn(){
		return this.endddyn;
	}

	public String getBasitm(){
		return this.basitm;
	}

	public String getPgmnm(){
		return this.pgmnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_WRK( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_WRKDM dm = (SS_A_WRKDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.id);
		cstmt.setString(6, dm.descri);
		cstmt.setString(7, dm.cycl);
		cstmt.setString(8, dm.basidt);
		cstmt.setString(9, dm.endddyn);
		cstmt.setString(10, dm.basitm);
		cstmt.setString(11, dm.pgmnm);
		cstmt.setString(12, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_A_WRKDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String id = req.getParameter("id");
if( id == null){
	System.out.println(this.toString+" : id is null" );
}else{
	System.out.println(this.toString+" : id is "+id );
}
String descri = req.getParameter("descri");
if( descri == null){
	System.out.println(this.toString+" : descri is null" );
}else{
	System.out.println(this.toString+" : descri is "+descri );
}
String cycl = req.getParameter("cycl");
if( cycl == null){
	System.out.println(this.toString+" : cycl is null" );
}else{
	System.out.println(this.toString+" : cycl is "+cycl );
}
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String endddyn = req.getParameter("endddyn");
if( endddyn == null){
	System.out.println(this.toString+" : endddyn is null" );
}else{
	System.out.println(this.toString+" : endddyn is "+endddyn );
}
String basitm = req.getParameter("basitm");
if( basitm == null){
	System.out.println(this.toString+" : basitm is null" );
}else{
	System.out.println(this.toString+" : basitm is "+basitm );
}
String pgmnm = req.getParameter("pgmnm");
if( pgmnm == null){
	System.out.println(this.toString+" : pgmnm is null" );
}else{
	System.out.println(this.toString+" : pgmnm is "+pgmnm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String id = Util.checkString(req.getParameter("id"));
String descri = Util.checkString(req.getParameter("descri"));
String cycl = Util.checkString(req.getParameter("cycl"));
String basidt = Util.checkString(req.getParameter("basidt"));
String endddyn = Util.checkString(req.getParameter("endddyn"));
String basitm = Util.checkString(req.getParameter("basitm"));
String pgmnm = Util.checkString(req.getParameter("pgmnm"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String id = Util.Uni2Ksc(Util.checkString(req.getParameter("id")));
String descri = Util.Uni2Ksc(Util.checkString(req.getParameter("descri")));
String cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("cycl")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String endddyn = Util.Uni2Ksc(Util.checkString(req.getParameter("endddyn")));
String basitm = Util.Uni2Ksc(Util.checkString(req.getParameter("basitm")));
String pgmnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pgmnm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setId(id);
dm.setDescri(descri);
dm.setCycl(cycl);
dm.setBasidt(basidt);
dm.setEndddyn(endddyn);
dm.setBasitm(basitm);
dm.setPgmnm(pgmnm);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 08 21:03:58 KST 2004 */