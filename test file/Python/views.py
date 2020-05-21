from django.views.generic import ListView, CreateView, UpdateView
from django.urls import reverse_lazy

from .models import Book
from .forms import SortedByDateForm


class HomeView(ListView):
    model = Book
    template_name = 'store/index.html'

    def get(self, request, *args, **kwargs):
        self.sorted_form = SortedByDateForm(self.request.GET)
        choices_dict = {'ascending_date': 'publish_date', 'descending_date': '-publish_date'}
        if self.sorted_form.is_valid():
            self.ordering = choices_dict[self.sorted_form.cleaned_data.get('sorted_by') or 'ascending_date']
        return super().get(request, *args, **kwargs)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs)
        context['sorted_by_date_form'] = self.sorted_form
        return context


class CreateBookView(CreateView):
    model = Book
    fields = ('book_title', 'authors_info', 'ISBN', 'price', 'publish_date', )
    template_name = 'store/create_edit_book.html'
    extra_context = {'title': 'Create book'}
    success_url = reverse_lazy('store:index')


class EditBookView(UpdateView):
    model = Book
    fields = ('book_title', 'authors_info', 'ISBN', 'price', 'publish_date',)
    template_name = 'store/create_edit_book.html'
    extra_context = {'title': 'Edit book'}
    pk_url_kwarg = 'book_id'
    success_url = reverse_lazy('store:index')
