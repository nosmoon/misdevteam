/***************************************************************************************************
 * ���ϸ�   : SL_L_DSTCINFOCDDM.java
 * ���     : ����������ȸ-��������
 * �ۼ����� : 2006/10/25
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
**  SP_SL_L_DSTCINFOCD
**/

public class SL_L_DSTCINFOCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;

	public SL_L_DSTCINFOCDDM(){}
	public SL_L_DSTCINFOCDDM(String bocd){
		this.bocd = bocd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_DSTCINFOCD( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_DSTCINFOCDDM dm = (SL_L_DSTCINFOCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.SL_L_DSTCINFOCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Oct 25 15:15:22 KST 2006 */