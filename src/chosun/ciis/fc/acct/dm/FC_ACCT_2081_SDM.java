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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2081_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String input_val_1;
	public String input_val_2;

	public FC_ACCT_2081_SDM(){}
	public FC_ACCT_2081_SDM(String cmpy_cd, String input_val_1, String input_val_2){
		this.cmpy_cd = cmpy_cd;
		this.input_val_1 = input_val_1;
		this.input_val_2 = input_val_2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInput_val_1(String input_val_1){
		this.input_val_1 = input_val_1;
	}

	public void setInput_val_2(String input_val_2){
		this.input_val_2 = input_val_2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInput_val_1(){
		return this.input_val_1;
	}

	public String getInput_val_2(){
		return this.input_val_2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2081_S(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2081_SDM dm = (FC_ACCT_2081_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.input_val_1);
		cstmt.setString(5, dm.input_val_2);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2081_SDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("input_val_1 = " + getInput_val_1());
        System.out.println("input_val_2 = " + getInput_val_2());
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
String input_val_1 = req.getParameter("input_val_1");
if( input_val_1 == null){
	System.out.println(this.toString+" : input_val_1 is null" );
}else{
	System.out.println(this.toString+" : input_val_1 is "+input_val_1 );
}
String input_val_2 = req.getParameter("input_val_2");
if( input_val_2 == null){
	System.out.println(this.toString+" : input_val_2 is null" );
}else{
	System.out.println(this.toString+" : input_val_2 is "+input_val_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String input_val_1 = Util.checkString(req.getParameter("input_val_1"));
String input_val_2 = Util.checkString(req.getParameter("input_val_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String input_val_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("input_val_1")));
String input_val_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("input_val_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInput_val_1(input_val_1);
dm.setInput_val_2(input_val_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 11:18:00 KST 2009 */