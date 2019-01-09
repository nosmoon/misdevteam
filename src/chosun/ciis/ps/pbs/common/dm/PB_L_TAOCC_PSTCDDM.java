/***************************************************************************************************
 * ���ϸ�   : PB_L_TAOCC_PSTCDDM.java
 * ���     : ����-�����ȣ �� �ּ� ã��
 * �ۼ����� : 2004-03-05
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * ����-�����ȣ �� �ּ� ã��
 */

public class PB_L_TAOCC_PSTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String addr3;
	public String zip;

	public PB_L_TAOCC_PSTCDDM(){}
	public PB_L_TAOCC_PSTCDDM(String addr3, String zip){
		this.addr3 = addr3;
		this.zip = zip;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getSQL(){
		 return "{ call SP_PB_L_TAOCC_PSTCD( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PB_L_TAOCC_PSTCDDM dm = (PB_L_TAOCC_PSTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.addr3);
		cstmt.setString(4, dm.zip);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.common.ds.PB_L_TAOCC_PSTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String addr3 = req.getParameter("addr3");
if( addr3 == null){
	System.out.println(this.toString+" : addr3 is null" );
}else{
	System.out.println(this.toString+" : addr3 is "+addr3 );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String addr3 = Util.checkString(req.getParameter("addr3"));
String zip = Util.checkString(req.getParameter("zip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAddr3(addr3);
dm.setZip(zip);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Mar 05 14:46:20 KST 2004 */