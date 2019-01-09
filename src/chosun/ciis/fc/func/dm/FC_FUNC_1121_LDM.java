/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1121_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr1;
	public String to1;
	public String fr2;
	public String to2;
	public String dlco_clsf_cd;
	public String dlco_cd;

	public FC_FUNC_1121_LDM(){}
	public FC_FUNC_1121_LDM(String cmpy_cd, String fr1, String to1, String fr2, String to2, String dlco_clsf_cd, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.fr1 = fr1;
		this.to1 = to1;
		this.fr2 = fr2;
		this.to2 = to2;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr1(String fr1){
		this.fr1 = fr1;
	}

	public void setTo1(String to1){
		this.to1 = to1;
	}

	public void setFr2(String fr2){
		this.fr2 = fr2;
	}

	public void setTo2(String to2){
		this.to2 = to2;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr1(){
		return this.fr1;
	}

	public String getTo1(){
		return this.to1;
	}

	public String getFr2(){
		return this.fr2;
	}

	public String getTo2(){
		return this.to2;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1121_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1121_LDM dm = (FC_FUNC_1121_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr1);
		cstmt.setString(5, dm.to1);
		cstmt.setString(6, dm.fr2);
		cstmt.setString(7, dm.to2);
		cstmt.setString(8, dm.dlco_clsf_cd);
		cstmt.setString(9, dm.dlco_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1121_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr1 = [" + getFr1() + "]");
		System.out.println("to1 = [" + getTo1() + "]");
		System.out.println("fr2 = [" + getFr2() + "]");
		System.out.println("to2 = [" + getTo2() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String fr1 = req.getParameter("fr1");
if( fr1 == null){
	System.out.println(this.toString+" : fr1 is null" );
}else{
	System.out.println(this.toString+" : fr1 is "+fr1 );
}
String to1 = req.getParameter("to1");
if( to1 == null){
	System.out.println(this.toString+" : to1 is null" );
}else{
	System.out.println(this.toString+" : to1 is "+to1 );
}
String fr2 = req.getParameter("fr2");
if( fr2 == null){
	System.out.println(this.toString+" : fr2 is null" );
}else{
	System.out.println(this.toString+" : fr2 is "+fr2 );
}
String to2 = req.getParameter("to2");
if( to2 == null){
	System.out.println(this.toString+" : to2 is null" );
}else{
	System.out.println(this.toString+" : to2 is "+to2 );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr1 = Util.checkString(req.getParameter("fr1"));
String to1 = Util.checkString(req.getParameter("to1"));
String fr2 = Util.checkString(req.getParameter("fr2"));
String to2 = Util.checkString(req.getParameter("to2"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr1 = Util.Uni2Ksc(Util.checkString(req.getParameter("fr1")));
String to1 = Util.Uni2Ksc(Util.checkString(req.getParameter("to1")));
String fr2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fr2")));
String to2 = Util.Uni2Ksc(Util.checkString(req.getParameter("to2")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr1(fr1);
dm.setTo1(to1);
dm.setFr2(fr2);
dm.setTo2(to2);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 21 14:19:11 KST 2009 */