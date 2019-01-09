/***************************************************************************************************
* ���ϸ� : SS_A_POSTDLVRDRDM.java
* ��� : ���ڰ��� ��۵��ڰ��� ����
* �ۼ����� : 2015-06-26
* �ۼ��� : �弱�� 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_S_POSTDLVRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;

	public SS_S_POSTDLVRDRDM(){}
	public SS_S_POSTDLVRDRDM(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_POSTDLVRDR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_POSTDLVRDRDM dm = (SS_S_POSTDLVRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_S_POSTDLVRDRDataSet();
	}



    public void print(){
        System.out.println("rdr_no = " + getRdr_no());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setRdr_no(rdr_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 26 19:58:54 KST 2015 */