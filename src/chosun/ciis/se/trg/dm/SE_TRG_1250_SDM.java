/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1250_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;

	public SE_TRG_1250_SDM(){}
	public SE_TRG_1250_SDM(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1250_S(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1250_SDM dm = (SE_TRG_1250_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.registerOutParameter(4, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1250_SDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 03 10:10:18 KST 2009 */