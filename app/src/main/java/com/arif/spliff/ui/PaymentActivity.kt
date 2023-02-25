package com.arif.spliff.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.arif.spliff.databinding.ActivityPaymentBinding
import com.sslwireless.sslcommerzlibrary.model.initializer.SSLCommerzInitialization
import com.sslwireless.sslcommerzlibrary.model.response.SSLCTransactionInfoModel
import com.sslwireless.sslcommerzlibrary.model.util.SSLCCurrencyType
import com.sslwireless.sslcommerzlibrary.model.util.SSLCSdkType
import com.sslwireless.sslcommerzlibrary.view.singleton.IntegrateSSLCommerz
import com.sslwireless.sslcommerzlibrary.viewmodel.listener.SSLCTransactionResponseListener

class PaymentActivity : AppCompatActivity(), SSLCTransactionResponseListener{
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val price = intent.getIntExtra("price",0)

        val sslCommerzInitialization = SSLCommerzInitialization(
            "creat613377970f2ed",
            "creat613377970f2ed@ssl",
            price.toDouble(),
            SSLCCurrencyType.BDT,
            "123456789098765",
            "yourProductType",
            SSLCSdkType.TESTBOX
        )


        IntegrateSSLCommerz
            .getInstance(this)
            .addSSLCommerzInitialization(sslCommerzInitialization)
            .buildApiCall(this)


    }

    override fun transactionSuccess(p0: SSLCTransactionInfoModel?) {
        TODO("Not yet implemented")
    }

    override fun transactionFail(p0: String?) {
        TODO("Not yet implemented")
    }

    override fun merchantValidationError(p0: String?) {
        TODO("Not yet implemented")
    }
}