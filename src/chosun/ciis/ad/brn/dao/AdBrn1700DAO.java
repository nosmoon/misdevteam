/***************************************************************************************************
 * ���ϸ�   : AdBrn1700DAO.java
 * ���     : ��������-�������� ȭ���� ��� �̺�Ʈ�� ó��
 * �ۼ����� : 
 * �ۼ���   : 
 ***************************************************************************************************/
/***************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 ***************************************************************************************************/

package chosun.ciis.ad.brn.dao;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import oracle.jdbc.OracleResultSet;
import oracle.sql.BLOB;
import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.ad.brn.dm.AD_BRN_1710_LDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1715_SDM;
import chosun.ciis.ad.brn.dm.AD_BRN_1740_ADM;
import chosun.ciis.ad.brn.dm.AD_BRN_1770_ADM;
import chosun.ciis.ad.brn.ds.AD_BRN_1710_LDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1715_SDataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1740_ADataSet;
import chosun.ciis.ad.brn.ds.AD_BRN_1770_ADataSet;


/**
 * ��������-��������
 */
 
public class AdBrn1700DAO {
	
    /**
     * ��������-�������� �����ȸ
     * @param dm AD_BRN_1710_LDM
     * @return AD_BRN_1710_LDataSet
     * @throws AppException 
     */
    public AD_BRN_1710_LDataSet ad_brn_1710_l(AD_BRN_1710_LDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_BRN_1710_LDataSet ds = (AD_BRN_1710_LDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }

    /**
     * ��������-�������� ������ȸ
     * @param dm AD_BRN_1715_SDM
     * @return AD_BRN_1715_SDataSet
     * @throws AppException
     */
    public AD_BRN_1715_SDataSet ad_brn_1715_s(AD_BRN_1715_SDM dm) throws AppException {    	
        DBManager manager = new DBManager("MISADV");
        
        AD_BRN_1715_SDataSet ds = (AD_BRN_1715_SDataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }        
        return ds;
    }
    
    /**
     * ��������-�������� �亯 ���,����,���� ó��
     * @param dm AD_BRN_1740_ADM
     * @return 
     * @throws AppException
     */
    public AD_BRN_1740_ADataSet ad_brn_1740_a(AD_BRN_1740_ADM dm) throws AppException {
    	
    	AD_BRN_1740_ADataSet ds = null;
        // ��Ͻ� ÷�������� ���� ��� �Ǵ� ������ ���ϰ����̰� ÷�������� ���� ���... 
        if ((dm.add_file != null && dm.add_file.length > 0 && "".equals(dm.file_delyn)) || 
        	(dm.add_file != null && dm.add_file.length > 0 && "U".equals(dm.file_delyn))
        ) {  
        	String tempSeq	= "";
        	byte[] tempCont = dm.add_file;
           	DBManager manager = null;

           	try {
          	
           		manager = new DBManager("MISADV");
           		manager.getConnection();
           		manager.m_conn.setAutoCommit(false);
            
           		CallableStatement cstmt = manager.m_conn.prepareCall(dm.getSQL());
               // �Ķ���� ����
        		cstmt.registerOutParameter(1, Types.VARCHAR);
        		cstmt.registerOutParameter(2, Types.VARCHAR);
        		cstmt.setString(3, dm.cmpy_cd);
        		cstmt.setString(4, dm.job_clsf);
        		cstmt.setString(5, dm.cntc_seq);
        		cstmt.setString(6, dm.answer_cont);
        		cstmt.setString(7, dm.add_file_nm);
        		cstmt.setBytes(8, "0101".getBytes());
        		cstmt.setString(9, dm.file_delyn);
        		cstmt.setString(10, dm.incmg_pers_ip);
        		cstmt.setString(11, dm.incmg_pers);
        		cstmt.registerOutParameter(12, Types.VARCHAR);
               // ����
	    		cstmt.execute();
               // ���
	    		ds = (AD_BRN_1740_ADataSet)dm.createDataSetObject();
	    		ds.getValues(cstmt);

	    		if(!"".equals(ds.errcode)){
                  	throw new AppException(ds.errcode, ds.errmsg);
	    		}
	    		
	    		tempSeq	=	ds.rmsg_seq;
               // BLOB ���ϱ�
	    		Statement stmt = manager.m_conn.createStatement();
	    		StringBuffer blobQuery = new StringBuffer();
	    		blobQuery.append(" SELECT ADD_FILE FROM MISCOM.TACOD_JOBCNTCRMSG ");
	    		blobQuery.append(" WHERE  CMPY_CD   = '"+dm.cmpy_cd +"' ");
	    		blobQuery.append(" AND    JOB_CLSF  = '"+dm.job_clsf+"' ");
	    		blobQuery.append(" AND    CNTC_SEQ  = '"+dm.cntc_seq+"' ");
	    		blobQuery.append(" AND    RMSG_SEQ  = '"+tempSeq+"' ");
	    		blobQuery.append(" FOR    UPDATE ");

	    		OracleResultSet rset = (OracleResultSet)stmt.executeQuery(blobQuery.toString());
         	
	    		if (rset.next()) {             
//	    			weblogic.jdbc.wrapper.Blob weblogic_blob = (weblogic.jdbc.wrapper.Blob)rset.getBlob(1);
//	    			BLOB oracle_blob = (BLOB)weblogic_blob.getVendorObj();
           	   		//������(ep1)
           	   		oracle.sql.BLOB oracle_blob = (BLOB)rset.getBlob(1);	
	    			
	    			OutputStream os = oracle_blob.getBinaryOutputStream();
                   // ���Ϸκ��� �о BLOB �� WRITE �Ѵ�.
	    			for(int i=0; i<tempCont.length; i++){
	    				os.write(tempCont[i]);
	    			}
	    			os.close();
	    		}
				manager.m_conn.commit();
				manager.m_conn.setAutoCommit(true);
	    		stmt.close();
	    		manager.disConnection();
           	} catch (Exception e) {
           		e.printStackTrace();
           		try{
           			manager.m_conn.rollback();
           		}catch(SQLException se){
           			throw new SysException(se);
           		}
           		manager.disConnection();
           		throw new SysException(e);
           	}
           	
        }else{
        	DBManager manager = new DBManager("MISADV");
        	ds = (AD_BRN_1740_ADataSet) manager.executeCall(dm);
        	if(!"".equals(ds.errcode)){
        		throw new AppException(ds.errcode, ds.errmsg);
        	}
        }
        return ds;
    }    
    
    /**
	 * ��������-�������� ÷������ �ٿ�ε�
	 * @param  AD_BRN_1770_ADM
	 * @return AD_BRN_1770_ADataSet
	 * @throws AppException
	 */
    public AD_BRN_1770_ADataSet ad_brn_1770_a(AD_BRN_1770_ADM dm) throws AppException {
    	
        DBManager manager = new DBManager("MISADV");
        
        AD_BRN_1770_ADataSet ds = (AD_BRN_1770_ADataSet) manager.executeCall(dm);
        
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
