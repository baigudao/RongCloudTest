package com.jackie.rongcloudtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.rong.imkit.RongIM;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initListener();
    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.bt1);
        btn2 = (Button) findViewById(R.id.bt2);
        btn3 = (Button) findViewById(R.id.bt3);
        btn4 = (Button) findViewById(R.id.bt4);
        btn5 = (Button) findViewById(R.id.bt5);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt1:
                if (RongIM.getInstance() != null){
                    RongIM.getInstance().startPrivateChat(this,"26594","title");
                }else {
                    Toast.makeText(this, "RongIM.getInstance为空！", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.bt2:

                break;
            case R.id.bt3:

                break;
            case R.id.bt4:

                break;
            case R.id.bt5:

                break;
            default:
                break;

        }
    }

    /**
     * <p>连接服务器，在整个应用程序全局，只需要调用一次，需在 {@link #init(Context)} 之后调用。</p>
     * <p>如果调用此接口遇到连接失败，SDK 会自动启动重连机制进行最多10次重连，分别是1, 2, 4, 8, 16, 32, 64, 128, 256, 512秒后。
     * 在这之后如果仍没有连接成功，还会在当检测到设备网络状态变化时再次进行重连。</p>
     *
     * @param token    从服务端获取的用户身份令牌（Token）。
     * @param callback 连接回调。
     * @return RongIM  客户端核心类的实例。
     */
    //    private void connect(String token) {
    //
    //        if (getApplicationInfo().packageName.equals(App.getCurProcessName(getApplicationContext()))) {
    //
    //            RongIM.connect(token, new RongIMClient.ConnectCallback() {
    //
    //                /**
    //                 * Token 错误。可以从下面两点检查 1.  Token 是否过期，如果过期您需要向 App Server 重新请求一个新的 Token
    //                 *                  2.  token 对应的 appKey 和工程里设置的 appKey 是否一致
    //                 */
    //                @Override
    //                public void onTokenIncorrect() {
    //
    //                }
    //
    //                /**
    //                 * 连接融云成功
    //                 * @param userid 当前 token 对应的用户 id
    //                 */
    //                @Override
    //                public void onSuccess(String userid) {
    //                    Log.d("LoginActivity", "--onSuccess" + userid);
    //                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
    //                    finish();
    //                }
    //
    //                /**
    //                 * 连接融云失败
    //                 * @param errorCode 错误码，可到官网 查看错误码对应的注释
    //                 */
    //                @Override
    //                public void onError(RongIMClient.ErrorCode errorCode) {
    //
    //                }
    //            });
    //        }
    //    }
}
