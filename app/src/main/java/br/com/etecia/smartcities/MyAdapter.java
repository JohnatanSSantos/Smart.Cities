package br.com.etecia.smartcities;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;

    private List<Menu> lstMenu;

    //criando o construtor da classe com parâmetros


    public MyAdapter(Context mContexto, List<Menu> lstMenu) {
        this.mContexto = mContexto;
        this.lstMenu = lstMenu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_menu_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idTitulo.setText(lstMenu.get(position).getTitulo());
        holder.idImagem.setImageResource(lstMenu.get(position).getImagem());

        holder.idCard.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContexto, ApresentaMenuActivity.class);

                intent.putExtra("Titulo", lstMenu.get(position).getTitulo());
                intent.putExtra("Descricao", lstMenu.get(position).getDescricao());
                intent.putExtra("Imagem", lstMenu.get(position).getImagem());

                mContexto.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

            }
        });

    }

    @Override
    public int getItemCount() {
        return lstMenu.size();
    }

    //criar a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTitulo;
        ImageView idImagem;

        CardView idCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTitulo = itemView.findViewById(R.id.idTituloMenu);
            idImagem = itemView.findViewById(R.id.idImgMenu);
            idCard = itemView.findViewById(R.id.idListaMenu);
        }
    }
}

