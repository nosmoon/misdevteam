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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_4010_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String unrcp_amt1;
	public String unrcp_amt2;
	public String unrcp_amt3;
	public String unrcp_amt4;
	public String unrcp_amt5;
	public String unrcp_amt6;
	public String unrcp_amt7;

	public AD_DEP_4010_ADM(){}
	public AD_DEP_4010_ADM(String cmpy_cd, String unrcp_amt1, String unrcp_amt2, String unrcp_amt3, String unrcp_amt4, String unrcp_amt5, String unrcp_amt6, String unrcp_amt7){
		this.cmpy_cd = cmpy_cd;
		this.unrcp_amt1 = unrcp_amt1;
		this.unrcp_amt2 = unrcp_amt2;
		this.unrcp_amt3 = unrcp_amt3;
		this.unrcp_amt4 = unrcp_amt4;
		this.unrcp_amt5 = unrcp_amt5;
		this.unrcp_amt6 = unrcp_amt6;
		this.unrcp_amt7 = unrcp_amt7;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUnrcp_amt1(String unrcp_amt1){
		this.unrcp_amt1 = unrcp_amt1;
	}

	public void setUnrcp_amt2(String unrcp_amt2){
		this.unrcp_amt2 = unrcp_amt2;
	}

	public void setUnrcp_amt3(String unrcp_amt3){
		this.unrcp_amt3 = unrcp_amt3;
	}

	public void setUnrcp_amt4(String unrcp_amt4){
		this.unrcp_amt4 = unrcp_amt4;
	}

	public void setUnrcp_amt5(String unrcp_amt5){
		this.unrcp_amt5 = unrcp_amt5;
	}

	public void setUnrcp_amt6(String unrcp_amt6){
		this.unrcp_amt6 = unrcp_amt6;
	}

	public void setUnrcp_amt7(String unrcp_amt7){
		this.unrcp_amt7 = unrcp_amt7;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUnrcp_amt1(){
		return this.unrcp_amt1;
	}

	public String getUnrcp_amt2(){
		return this.unrcp_amt2;
	}

	public String getUnrcp_amt3(){
		return this.unrcp_amt3;
	}

	public String getUnrcp_amt4(){
		return this.unrcp_amt4;
	}

	public String getUnrcp_amt5(){
		return this.unrcp_amt5;
	}

	public String getUnrcp_amt6(){
		return this.unrcp_amt6;
	}

	public String getUnrcp_amt7(){
		return this.unrcp_amt7;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_4010_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_4010_ADM dm = (AD_DEP_4010_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.unrcp_amt1);
		cstmt.setString(5, dm.unrcp_amt2);
		cstmt.setString(6, dm.unrcp_amt3);
		cstmt.setString(7, dm.unrcp_amt4);
		cstmt.setString(8, dm.unrcp_amt5);
		cstmt.setString(9, dm.unrcp_amt6);
		cstmt.setString(10, dm.unrcp_amt7);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_4010_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("unrcp_amt1 = [" + getUnrcp_amt1() + "]");
		System.out.println("unrcp_amt2 = [" + getUnrcp_amt2() + "]");
		System.out.println("unrcp_amt3 = [" + getUnrcp_amt3() + "]");
		System.out.println("unrcp_amt4 = [" + getUnrcp_amt4() + "]");
		System.out.println("unrcp_amt5 = [" + getUnrcp_amt5() + "]");
		System.out.println("unrcp_amt6 = [" + getUnrcp_amt6() + "]");
		System.out.println("unrcp_amt7 = [" + getUnrcp_amt7() + "]");
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
String unrcp_amt1 = req.getParameter("unrcp_amt1");
if( unrcp_amt1 == null){
	System.out.println(this.toString+" : unrcp_amt1 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt1 is "+unrcp_amt1 );
}
String unrcp_amt2 = req.getParameter("unrcp_amt2");
if( unrcp_amt2 == null){
	System.out.println(this.toString+" : unrcp_amt2 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt2 is "+unrcp_amt2 );
}
String unrcp_amt3 = req.getParameter("unrcp_amt3");
if( unrcp_amt3 == null){
	System.out.println(this.toString+" : unrcp_amt3 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt3 is "+unrcp_amt3 );
}
String unrcp_amt4 = req.getParameter("unrcp_amt4");
if( unrcp_amt4 == null){
	System.out.println(this.toString+" : unrcp_amt4 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt4 is "+unrcp_amt4 );
}
String unrcp_amt5 = req.getParameter("unrcp_amt5");
if( unrcp_amt5 == null){
	System.out.println(this.toString+" : unrcp_amt5 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt5 is "+unrcp_amt5 );
}
String unrcp_amt6 = req.getParameter("unrcp_amt6");
if( unrcp_amt6 == null){
	System.out.println(this.toString+" : unrcp_amt6 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt6 is "+unrcp_amt6 );
}
String unrcp_amt7 = req.getParameter("unrcp_amt7");
if( unrcp_amt7 == null){
	System.out.println(this.toString+" : unrcp_amt7 is null" );
}else{
	System.out.println(this.toString+" : unrcp_amt7 is "+unrcp_amt7 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String unrcp_amt1 = Util.checkString(req.getParameter("unrcp_amt1"));
String unrcp_amt2 = Util.checkString(req.getParameter("unrcp_amt2"));
String unrcp_amt3 = Util.checkString(req.getParameter("unrcp_amt3"));
String unrcp_amt4 = Util.checkString(req.getParameter("unrcp_amt4"));
String unrcp_amt5 = Util.checkString(req.getParameter("unrcp_amt5"));
String unrcp_amt6 = Util.checkString(req.getParameter("unrcp_amt6"));
String unrcp_amt7 = Util.checkString(req.getParameter("unrcp_amt7"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String unrcp_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt1")));
String unrcp_amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt2")));
String unrcp_amt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt3")));
String unrcp_amt4 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt4")));
String unrcp_amt5 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt5")));
String unrcp_amt6 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt6")));
String unrcp_amt7 = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_amt7")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUnrcp_amt1(unrcp_amt1);
dm.setUnrcp_amt2(unrcp_amt2);
dm.setUnrcp_amt3(unrcp_amt3);
dm.setUnrcp_amt4(unrcp_amt4);
dm.setUnrcp_amt5(unrcp_amt5);
dm.setUnrcp_amt6(unrcp_amt6);
dm.setUnrcp_amt7(unrcp_amt7);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 17:22:30 KST 2009 */