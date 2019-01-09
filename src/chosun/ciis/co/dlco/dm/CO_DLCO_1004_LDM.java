/***************************************************************************************************
* ���ϸ� : CO_DLCO_1004_LDM.java
* ��� : ����-����ŷ�ó
* �ۼ����� : 2009-04-13
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1004_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dlco_no;

	public CO_DLCO_1004_LDM(){}
	public CO_DLCO_1004_LDM(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call SP_CO_DLCO_1004_L( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1004_LDM dm = (CO_DLCO_1004_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dlco_no);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1004_LDataSet();
	}



    public void print(){
        System.out.println("dlco_no = " + getDlco_no());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 06 16:46:20 KST 2009 */