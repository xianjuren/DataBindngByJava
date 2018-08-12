package databingdingbyjava.myapplication.recyclerView;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import databingdingbyjava.myapplication.R;
import databingdingbyjava.myapplication.customBinding.CustomUser;
import databingdingbyjava.myapplication.databinding.UserItemBinding;


public class UserAdapter extends RecyclerView.Adapter {

    List<CustomUser> mUsers;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CustomUser customUser = mUsers.get(position);
        if (null != customUser) {
            UserHolder userHolder = (UserHolder) holder;
            userHolder.mItemBinding.setUser(customUser);
        }
    }


    public void setData(List<CustomUser> users) {
        mUsers = users;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (null != mUsers) {
            return mUsers.size();
        }
        return 0;
    }

    private class UserHolder extends RecyclerView.ViewHolder {
        UserItemBinding mItemBinding;

        private UserHolder(View view) {
            super(view);
            mItemBinding = DataBindingUtil.bind(view);
        }
    }
}
