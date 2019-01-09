/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_1003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String avg_tm_dt;

	public HD_LVCMPY_1003_LDM(){}
	public HD_LVCMPY_1003_LDM(String avg_tm_dt){
		this.avg_tm_dt = avg_tm_dt;
	}

	public void setAvg_tm_dt(String avg_tm_dt){
		this.avg_tm_dt = avg_tm_dt;
	}

	public String getAvg_tm_dt(){
		return this.avg_tm_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_1003_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_1003_LDM dm = (HD_LVCMPY_1003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.avg_tm_dt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_1003_LDataSet();
	}



    public void print(){
        System.out.println("avg_tm_dt = " + getAvg_tm_dt());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String avg_tm_dt = req.getParameter("avg_tm_dt");
if( avg_tm_dt == null){
	System.out.println(this.toString+" : avg_tm_dt is null" );
}else{
	System.out.println(this.toString+" : avg_tm_dt is "+avg_tm_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String avg_tm_dt = Util.checkString(req.getParameter("avg_tm_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String avg_tm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_tm_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setAvg_tm_dt(avg_tm_dt);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 27 20:28:29 KST 2009 */