/***************************************************************************************************
* 파일명 : SS_A_BO_HEADIDEADM.java
* 기능 : 지국Info-지국장-지국장소견 등록,수정,삭제를 위한 DM
* 작성일자 : 2004-05-19
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국Info-지국장-지국장소견 등록,수정,삭제를 위한 DM
 */

public class SS_A_BO_HEADIDEADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String incmgpers;
	public String prn;
	public String seq;
	public String makedt;
	public String makepersnm;
	public String idea1;
	public String idea2;
	public String idea3;

	public SS_A_BO_HEADIDEADM(){}
	public SS_A_BO_HEADIDEADM(String accflag, String incmgpers, String prn, String seq, String makedt, String makepersnm, String idea1, String idea2, String idea3){
		this.accflag = accflag;
		this.incmgpers = incmgpers;
		this.prn = prn;
		this.seq = seq;
		this.makedt = makedt;
		this.makepersnm = makepersnm;
		this.idea1 = idea1;
		this.idea2 = idea2;
		this.idea3 = idea3;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setIdea1(String idea1){
		this.idea1 = idea1;
	}

	public void setIdea2(String idea2){
		this.idea2 = idea2;
	}

	public void setIdea3(String idea3){
		this.idea3 = idea3;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getIdea1(){
		return this.idea1;
	}

	public String getIdea2(){
		return this.idea2;
	}

	public String getIdea3(){
		return this.idea3;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_BO_HEADIDEA( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_BO_HEADIDEADM dm = (SS_A_BO_HEADIDEADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.prn);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.makedt);
		cstmt.setString(8, dm.makepersnm);
		cstmt.setString(9, dm.idea1);
		cstmt.setString(10, dm.idea2);
		cstmt.setString(11, dm.idea3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_A_BO_HEADIDEADataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String makedt = req.getParameter("makedt");
if( makedt == null){
	System.out.println(this.toString+" : makedt is null" );
}else{
	System.out.println(this.toString+" : makedt is "+makedt );
}
String makepersnm = req.getParameter("makepersnm");
if( makepersnm == null){
	System.out.println(this.toString+" : makepersnm is null" );
}else{
	System.out.println(this.toString+" : makepersnm is "+makepersnm );
}
String idea1 = req.getParameter("idea1");
if( idea1 == null){
	System.out.println(this.toString+" : idea1 is null" );
}else{
	System.out.println(this.toString+" : idea1 is "+idea1 );
}
String idea2 = req.getParameter("idea2");
if( idea2 == null){
	System.out.println(this.toString+" : idea2 is null" );
}else{
	System.out.println(this.toString+" : idea2 is "+idea2 );
}
String idea3 = req.getParameter("idea3");
if( idea3 == null){
	System.out.println(this.toString+" : idea3 is null" );
}else{
	System.out.println(this.toString+" : idea3 is "+idea3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String prn = Util.checkString(req.getParameter("prn"));
String seq = Util.checkString(req.getParameter("seq"));
String makedt = Util.checkString(req.getParameter("makedt"));
String makepersnm = Util.checkString(req.getParameter("makepersnm"));
String idea1 = Util.checkString(req.getParameter("idea1"));
String idea2 = Util.checkString(req.getParameter("idea2"));
String idea3 = Util.checkString(req.getParameter("idea3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String makedt = Util.Uni2Ksc(Util.checkString(req.getParameter("makedt")));
String makepersnm = Util.Uni2Ksc(Util.checkString(req.getParameter("makepersnm")));
String idea1 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea1")));
String idea2 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea2")));
String idea3 = Util.Uni2Ksc(Util.checkString(req.getParameter("idea3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setIncmgpers(incmgpers);
dm.setPrn(prn);
dm.setSeq(seq);
dm.setMakedt(makedt);
dm.setMakepersnm(makepersnm);
dm.setIdea1(idea1);
dm.setIdea2(idea2);
dm.setIdea3(idea3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 20 20:53:51 KST 2004 */