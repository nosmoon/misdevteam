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


package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{


	public HD_VACA_1000_ADM(){}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1000_A() }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1000_ADM dm = (HD_VACA_1000_ADM)bdm;
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
	}

	public BaseDataSet createDataSetObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 20:31:00 KST 2009 */